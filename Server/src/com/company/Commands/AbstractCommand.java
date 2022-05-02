package com.company.Commands;

import com.company.Utility.Command;

import java.io.Serializable;

public abstract class AbstractCommand implements Serializable, Command {
    private static final long serialVersionUID = 2;
    public AbstractCommand() {
        this.execute();
    }
}
