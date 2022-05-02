package com.company.Commands;

import com.company.Main;
import com.company.classes.StudyGroup;

public class filter_by_form_of_educationCommand extends AbstractCommand {
    public static String formOfEducation;

    public filter_by_form_of_educationCommand(String formOfEducation) {
        filter_by_form_of_educationCommand.formOfEducation = formOfEducation;
    }

    private static final long serialVersionUID = 6;

    @Override
    public void execute() {
        String[] a = new String[1];
        a[0]=formOfEducation;
        AllCommands.filter_by_form_of_education(a);
    }
}

