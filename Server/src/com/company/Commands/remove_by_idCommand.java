package com.company.Commands;


public class remove_by_idCommand extends AbstractCommand {
    public static Long ID;
    private static final long serialVersionUID = 11;
    @Override
    public void execute() {
        String[] a = new String[1];
        a[0]= String.valueOf(ID);
        AllCommands.remove_by_id(a);
    }

    public remove_by_idCommand(Long ID) {
        remove_by_idCommand.ID = ID;
    }
}
