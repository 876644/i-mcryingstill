package com.company.Utility;

import com.company.Commands.AbstractCommand;
import com.company.Main;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import static com.company.Main.message;
import static com.company.Main.object;

public class Server {
    public static byte[] receivingDataBuffer = new byte[16384];
    public static byte[] sendingDataBuffer = new byte[16384];
    public static DatagramSocket datagramSocket;//  получать ответы от клиента

    public static DatagramPacket inputPacket;

    public static void connection() {
        try {
            int port = 21055;
            datagramSocket = new DatagramSocket(port);
            receivingDataBuffer = new byte[16384];
            inputPacket = new DatagramPacket(receivingDataBuffer, receivingDataBuffer.length);//экземпляр UDP-пакета для хранения клиентских данных с использованием буфера для полученных данных
            System.out.println("Ждём действий от клиента...");

            datagramSocket.receive(inputPacket);// получаем данные от клиента и сохраните их в datagramPacket
            System.out.println("Был получен объект. Идёт обработка... ");
            Thread.sleep(300);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void read() {

        try {
            object = (AbstractCommand) deserialize(receivingDataBuffer);
            object.execute();
            System.out.println("Идёт выпеполнение команды...");
            Thread.sleep(300);
        } catch (IOException | ClassNotFoundException | InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static Object deserialize(byte[] array) throws IOException, ClassNotFoundException{

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(array);
        ObjectInput objectInput = new ObjectInputStream(byteArrayInputStream);
        return objectInput.readObject();
    }

    public static byte[] serialize(Object obj) throws IOException{

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();//данные записываются в массив байтов
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(obj);//Записывает указанный объект в ObjectOutputStream
        objectOutputStream.flush();//Сбрасывает поток
        return byteArrayOutputStream.toByteArray();

    }

    public static void sent() {
        try {
            InetAddress host = inputPacket.getAddress(); // Получение IP-адрес и порт клиента
            int senderPort = inputPacket.getPort();

            sendingDataBuffer = serialize(message);
            //  новый UDP-пакет с данными, чтобы отправить их клиенту
            DatagramPacket outputPacket = new DatagramPacket(sendingDataBuffer, sendingDataBuffer.length, host, senderPort);

            datagramSocket.send(outputPacket);// Отправляем пакет клиенту
            System.out.println("Сообщение о результате выполненной команды было отправлено на клиент.");
            Thread.sleep(300);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
