package com.company.Commands;

import com.company.Main;
import com.company.classes.StudyGroup;

public class remove_headCommand extends AbstractCommand {
    private static final long serialVersionUID = 12;
    @Override
    public void execute() {
        String[] a = new String[0];
        AllCommands.remove_head(a);
    }
}
