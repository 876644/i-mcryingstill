package com.company.Commands;

import com.company.Main;

import java.time.LocalDate;

public class infoCommand extends AbstractCommand {
    private static final long serialVersionUID = 9;
    @Override
    public void execute() {
        String[] a = new String[0];
        AllCommands.info(a);
    }
}
