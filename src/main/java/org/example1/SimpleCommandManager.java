package org.example1;

import java.util.ArrayList;
import java.util.List;

public class SimpleCommandManager implements CommandManager {
    private final List<Command> commandsQueue = new ArrayList<>();

    @Override
    public void addCommand(Command command) {
        commandsQueue.add(command);
    }

    @Override
    public void executeCommands() {
        for (Command command : commandsQueue) {
            command.execute();
        }
        commandsQueue.clear();
    }
}
