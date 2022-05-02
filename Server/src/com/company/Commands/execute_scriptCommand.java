package com.company.Commands;

public class execute_scriptCommand extends AbstractCommand {
    private static final long serialVersionUID = 5;
    public  String fileName;
    @Override
    public void execute() {
        String[] a = new String[1];
        a[0]= String.valueOf(fileName);
        AllCommands.execute_script(a);
    }

    public execute_scriptCommand(String fileName) {
        this.fileName = fileName;
    }
}
