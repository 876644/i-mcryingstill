package com.company.Utility;

import com.company.Enums.*;
import com.company.Main;
import com.company.classes.Coordinates;
import com.company.classes.Person;
import com.company.classes.StudyGroup;

import java.io.*;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FileCreate {


    //метод для чтения файла, данные которого записываются в коллекцию
    public static void readFile() {
        try {
            FileInputStream fileInputStream = new FileInputStream(Main.file);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                if (line.length() != 0){
                    String[] asplit = line.split(";");

                    for (int i = 0; i <= 11; i++) {
                        switch (i) {
                            case 0: {

                                Random random = new Random();

                                while ((!Pattern.compile("\\d+").matcher(asplit[i]).matches())) {
                                    System.out.println("Неправильные данные id в файле.Новое iD было сгенерировано автоматически ");
                                    asplit[i] = String.valueOf(random.nextInt(1000) + 1);

                                }
                                while (Long.parseLong(asplit[i]) <= 0){
                                    System.out.println("Неправильные данные id в файле.Новое iD было сгенерировано автоматически ");
                                    asplit[i] = String.valueOf(random.nextInt(1000) + 1);
                                }
                                while (Main.AllId.contains(Long.parseLong(asplit[i]))) {
                                    asplit[i] = String.valueOf(random.nextInt(1000) + 1);
                                }
                                Main.AllId.add(Long.parseLong(asplit[i]));
                                break;

                            }
                            case 1: {

                                while (!Pattern.compile("[A-Z]*[a-z]*[0-9]*").matcher(asplit[i]).matches()||asplit[i].equals("")) {
                                    System.out.println("Неправильные данные имени группы в файле.Пример имени группы :R3136\n" +
                                            "Введите новые данные: ");

                                    Scanner scanner = new Scanner(System.in);
                                    asplit[i] = scanner.nextLine();
                                }
                                break;
                            }
                            case 2: {

                                while ((!Pattern.compile("[0-9].*[0-9]*").matcher(asplit[i]).matches()||asplit[i].equals("")) ) {
                                    System.out.println("Неправильные данные координаты x в файле. Пример координаты x: 2.56 \n" +
                                            "Введите новые данные: ");

                                    Scanner scanner = new Scanner(System.in);
                                    asplit[i] = scanner.nextLine();
                                }
                                while (Double.parseDouble(asplit[i]) > 887){
                                    System.out.println("Неправильные данные координаты x в файле.Пример координаты x: 2.56 \n" +
                                            "Введите новые данные: ");

                                    Scanner scanner = new Scanner(System.in);
                                    asplit[i] = scanner.nextLine();
                                }
                                break;
                            }
                            case 3: {

                                while (asplit[i].equals("")||!Pattern.compile("\\d+").matcher(asplit[i]).matches()) {
                                    System.out.println("Неправильные данные координаты y в файле.Пример координаты y: 2 \n" +
                                            "Введите новые данные: ");

                                    Scanner scanner = new Scanner(System.in);
                                    asplit[i] = scanner.nextLine();
                                }
                                break;
                            }
                            case 4: {

                                while ((!Pattern.compile("\\d+").matcher(asplit[i]).matches()))
                                    while (Long.parseLong(asplit[i]) <= 0){
                                        System.out.println("Неправильные данные колличество студентов в файле. Пример колличества студентов: 56 \n" +
                                                "Введите новые данные: ");

                                        Scanner scanner = new Scanner(System.in);
                                        asplit[i] = scanner.nextLine();
                                    }
                                break;
                            }
                            case 5: {

                                while (!asplit[i].equals("FULL_TIME_EDUCATION") && !asplit[i].equals("DISTANCE_EDUCATION") && !asplit[i].equals("EVENING_CLASSES")) {
                                    System.out.println("Неправильные данные формы образования в файле. Пример формы образования: DISTANCE_EDUCATION\n" +
                                            "Введите новые данные: ");

                                    Scanner scanner = new Scanner(System.in);
                                    asplit[i] = scanner.nextLine();
                                }
                                break;
                            }
                            case 6: {

                                while (!asplit[i].equals("FIFTH") && !asplit[i].equals("SIXTH") && !asplit[i].equals("SEVENTH") ) {
                                    System.out.println("Неправильные данные семестра в файле. Пример семестра: SEVENTH \n" +
                                            "Введите новые данные: ");

                                    Scanner scanner = new Scanner(System.in);
                                    asplit[i] = scanner.nextLine();
                                }
                                break;
                            }
                            case 7: {

                                while (asplit[i].equals("") || !Pattern.compile("[A-Z]*[a-z]*").matcher(asplit[i]).matches() ) {
                                    System.out.println("Неправильно имя студента в файле. Пример имени: Lora \n" +
                                            "Введите новые данные: ");

                                    Scanner scanner = new Scanner(System.in);
                                    asplit[i] = scanner.nextLine();
                                }
                                break;
                            }
                            case 8: {

                                while (asplit[i].equals("") || (!Pattern.compile("[A-Z]*[a-z]*[0-9]*").matcher(asplit[i]).matches())){
                                    System.out.println("Неправильные данные ID паспорта в файле. Пример iD паспорта: i1578kL \n" +
                                            "Введите новые данные: ");

                                    Scanner scanner = new Scanner(System.in);
                                    asplit[i] = scanner.nextLine();
                                }
                                while ((String.valueOf(asplit[i]).length()) > 31){
                                    System.out.println("Неправильные данные ID паспорта в файле. Пример iD паспорта: i1578kL \n" +
                                            "Введите новые данные: ");

                                    Scanner scanner = new Scanner(System.in);
                                    asplit[i] = scanner.nextLine();
                                }
                                break;
                            }
                            case 9: {

                                while (!asplit[i].equals("GREEN") && !asplit[i].equals("YELLOW") && !asplit[i].equals("ORANGE") && !asplit[i].equals("WHITE") ) {
                                    System.out.println("Неправильные данные цвета глаз в файле. Пример цвета глаз: GREEN \n" +
                                            "Введите новые данные: ");

                                    Scanner scanner = new Scanner(System.in);
                                    asplit[i] = scanner.nextLine();
                                }
                                break;
                            }
                            case 10: {

                                while (!asplit[i].equals("GREEN") && !asplit[i].equals("RED") && !asplit[i].equals("YELLOW") && !asplit[i].equals("WHITE")) {
                                    System.out.println("Неправильные данные цвета волос в файле. Пример цвета волос: GREEN \n" +
                                            "Введите новые данные: ");

                                    Scanner scanner = new Scanner(System.in);
                                    asplit[i] = scanner.nextLine();
                                }
                                break;
                            }
                            case 11: {

                                while (!asplit[i].equals("RUSSIA") && !asplit[i].equals("GERMANY") && !asplit[i].equals("CHINA") && !asplit[i].equals("NORTH_KOREA") ) {
                                    System.out.println("Неправильные данные национальности в файле. Пример национальности: RUSSIA\n" +
                                            "Введите новые данные: ");

                                    Scanner scanner = new Scanner(System.in);
                                    asplit[i] = scanner.nextLine();
                                }
                                break;
                            }
                        }
                    }

                    Date date = new Date();

                    Coordinates coordinates = new Coordinates(Double.parseDouble(asplit[2]), Integer.valueOf(asplit[3]));
                    Person person = new Person(String.valueOf(asplit[7]), String.valueOf(asplit[8]), ColorEye.valueOf(asplit[9]), ColorHair.valueOf(asplit[10]), Country.valueOf(asplit[11]));
                    StudyGroup studyGroup = new StudyGroup(Long.valueOf(asplit[0]), String.valueOf(asplit[1]), coordinates, date, Long.valueOf(asplit[4]), FormOfEducation.valueOf(asplit[5]), Semester.valueOf(asplit[6]), person);

                    Main.collection.add(studyGroup);

                }

            }
            bufferedReader.close();

        } catch (IOException | NumberFormatException e) {
            System.out.println("Неправильно введены данные в файле.");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Недостаточное колличество полей в файле.");
        }
    }
}
