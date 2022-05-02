package com.company;

import com.company.Commands.AbstractCommand;
import com.company.Utility.Console;
import com.company.Utility.FileCreate;
import com.company.Utility.Message;
import com.company.Utility.Server;
import com.company.classes.StudyGroup;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

import static com.company.Utility.Server.*;

public class Main {

    public static PriorityQueue<StudyGroup> collection = new PriorityQueue<>();//Создала коллекцию
    public static File file = new File(System.getenv("LABA"));
    public static List<Long> AllId = new ArrayList<>();
    public static List<StudyGroup> twoColl = new ArrayList<>();
    public static List<String> saveHistory = new ArrayList<>();

    public static AbstractCommand object;
    public static Message message;
    public static String answer;


    public static void main(String[] args) {

        AllId.clear();
        if (file.length() == 0) {
            System.out.println("Файл пуст.");
        } else FileCreate.readFile();

        Thread mainThread = new Thread(()->{
            while (true) {
                answer = "\n";
                connection();
                read();
                message = new Message(answer);
                sent();
                datagramSocket.close();//закрытие соединение сокетов
            }
        });

        Thread subThread = new Thread(()->{
            while (true){
                Console.mm();
            }
        });
        mainThread.start();
        subThread.start();
    }
}
