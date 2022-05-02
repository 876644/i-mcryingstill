package com.company.Commands;

import com.company.Enums.*;

public class addCommand extends AbstractCommand {
    public static String nameOfGroup;
    public static Double x;
    public static Integer y;
    public static Long studentsCount;
    public static FormOfEducation formOfEducation;
    public static Semester semesterEnum;
    public static String namePerson;
    public static String passportID;
    public static ColorEye eyeColor;
    public static ColorHair hairColor;
    public static Country nationality;

    private static final long serialVersionUID = 3;

    public addCommand(String nameOfGroup, Double x, Integer y, Long studentsCount, FormOfEducation formOfEducation, Semester semesterEnum, String namePerson, String passportID, ColorEye eyeColor, ColorHair hairColor, Country nationality, AllCommands allCommands) {
        addCommand.nameOfGroup = nameOfGroup;
        addCommand.x = x;
        addCommand.y = y;
        addCommand.studentsCount = studentsCount;
        addCommand.formOfEducation = formOfEducation;
        addCommand.semesterEnum = semesterEnum;
        addCommand.namePerson = namePerson;
        addCommand.passportID = passportID;
        addCommand.eyeColor = eyeColor;
        addCommand.hairColor = hairColor;
        addCommand.nationality = nationality;
    }

    @Override
    public void execute() {
        String[] a = new String[0];
        AllCommands.add(a);
    }

}
