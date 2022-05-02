package com.company.Commands;

import com.company.Main;
import com.company.Utility.Message;
import com.company.Utility.Server;
import com.company.classes.StudyGroup;

import java.io.IOException;
import java.util.Objects;
import java.util.Optional;

public class updateCommand extends AbstractCommand {
    public Long ID;
    private static final long serialVersionUID = 14;
    @Override
    public void execute() {
        String[] a = new String[1];
        a[0]= String.valueOf(ID);
        try {
            AllCommands.update(a);
        } catch (IOException | InterruptedException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public updateCommand(Long ID) {
        this.ID = ID;
    }

}
