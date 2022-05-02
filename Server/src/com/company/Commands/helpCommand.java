package com.company.Commands;

import com.company.Main;

public class helpCommand extends AbstractCommand {
    private static final long serialVersionUID = 8;

    @Override
    public void execute() {
        String[] a = new String[0];
        AllCommands.help(a);
    }
}
