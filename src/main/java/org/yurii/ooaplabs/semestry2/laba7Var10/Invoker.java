package org.yurii.ooaplabs.semestry2.laba7Var10;

import java.util.ArrayList;
import java.util.List;


class Invoker {
    private List<Command> commandHistory = new ArrayList<>();

    public void executeCommand(Command command) {
        command.execute();
        commandHistory.add(command);
    }

    public void undoLastCommand() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.removeLast();
            System.out.println("Undoing last command...");
            lastCommand.execute();
        } else {
            System.out.println("No commands to undo.");
        }
    }
}