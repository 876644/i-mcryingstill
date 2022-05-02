package com.company.Commands;

import com.company.Main;

public class clearCommand extends AbstractCommand {

    private static final long serialVersionUID = 1;


    @Override
    public void execute() {
        String[] a = new String[0];
        AllCommands.clear(a);
    }

}
