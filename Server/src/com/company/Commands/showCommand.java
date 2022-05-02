package com.company.Commands;

import com.company.Main;
import com.company.classes.StudyGroup;

public class showCommand extends AbstractCommand {
    private static final long serialVersionUID = 13;

    @Override
    public void execute() {
        String[] a = new String[0];
        AllCommands.show(a);
    }
}
