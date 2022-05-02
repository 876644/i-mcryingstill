package com.company.Commands;

import com.company.Main;
import com.company.classes.StudyGroup;

public class remove_any_by_students_countCommand extends AbstractCommand {
    public static Long countOfStudents;
    private static final long serialVersionUID = 10;

    @Override
    public void execute() {
        String[] a = new String[1];
        a[0]= String.valueOf(countOfStudents);
        AllCommands.remove_any_by_students_count(a);
    }

    public remove_any_by_students_countCommand(Long countOfStudents){
            remove_any_by_students_countCommand.countOfStudents = countOfStudents;
        }

}
