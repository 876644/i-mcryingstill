package com.company.Utility;

import com.company.Main;
import com.company.classes.StudyGroup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ConsoleCommands {
    @Annotation(name = "save")//работает
    public void save (String[] args) throws IOException {
        if (args.length == 0){

            FileWriter fileWriter = new FileWriter(String.valueOf(Main.file));
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            int sizeOfCollection = Main.collection.size();
            if(sizeOfCollection==0){
                System.out.println("В коллекции нет объектов.");
            }

            for(int b=1; b<=sizeOfCollection;b++){

                StudyGroup example = Main.collection.poll();
                Main.twoColl.add(example);

                if (example != null) {
                    bufferedWriter.write(String.valueOf(example.getId()));
                    bufferedWriter.write(";");
                    bufferedWriter.write(String.valueOf(example.getNameG()));
                    bufferedWriter.write(";");
                    bufferedWriter.write(String.valueOf(example.getCoordinates().getX()));
                    bufferedWriter.write(";");
                    bufferedWriter.write(String.valueOf(example.getCoordinates().getY()));
                    bufferedWriter.write(";");
                    bufferedWriter.write(String.valueOf(example.getStudentsCount()));
                    bufferedWriter.write(";");
                    bufferedWriter.write(String.valueOf(example.getFormOfEducation()));
                    bufferedWriter.write(";");
                    bufferedWriter.write(String.valueOf(example.getSemesterEnum()));
                    bufferedWriter.write(";");
                    bufferedWriter.write(String.valueOf(example.getGroupAdmin().getName()));
                    bufferedWriter.write(";");
                    bufferedWriter.write(String.valueOf(example.getGroupAdmin().getPassportID()));
                    bufferedWriter.write(";");
                    bufferedWriter.write(String.valueOf(example.getGroupAdmin().getEyeColor()));
                    bufferedWriter.write(";");
                    bufferedWriter.write(String.valueOf(example.getGroupAdmin().getHairColor()));
                    bufferedWriter.write(";");
                    bufferedWriter.write(String.valueOf(example.getGroupAdmin().getNationality()));
                    bufferedWriter.newLine();
                }
            }
            Main.collection.addAll(Main.twoColl);
            Main.twoColl.clear();
            bufferedWriter.close();
            System.out.println("Объекты сохранены в файл.");

        }else {
            System.out.println("У команды save нет аргумента.");

        }
    }

    @Annotation(name = "exit")//работает
    public void exit(String[] args){
        if (args.length != 0){

            System.out.println("У этой команды нет аргумента, попробуйте ещё раз.\n " );

        }else {
            System.out.println("Серверное приложение завершило работу.");
            System.exit(0);
        }
    }
}
