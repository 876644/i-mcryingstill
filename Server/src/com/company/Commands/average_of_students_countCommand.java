package com.company.Commands;

public class average_of_students_countCommand extends AbstractCommand {

    private static final long serialVersionUID = 4;

    @Override
    public void execute() {
        String[] a = new String[0];
        AllCommands.average_of_students_count(a);
    }
}
