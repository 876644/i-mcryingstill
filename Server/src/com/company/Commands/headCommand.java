package com.company.Commands;

import com.company.Main;

public class headCommand extends AbstractCommand {
    private static final long serialVersionUID = 7;

    @Override
    public void execute() {
        String[] a = new String[0];
        AllCommands.head(a);
    }

}

