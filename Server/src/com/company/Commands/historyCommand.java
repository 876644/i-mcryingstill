package com.company.Commands;

import com.company.Main;

public class historyCommand extends AbstractCommand {
    private static final long serialVersionUID = 20;
    @Override
    public void execute() {
        String[] a = new String[0];
        AllCommands.history(a);
    }
}
