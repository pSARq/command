package org.example2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleCommandManager implements Command {
    private final List<Command> commandsQueue = new ArrayList<>();

    public SimpleCommandManager(Command... commands) {
        Collections.addAll(commandsQueue, commands);
    }

    @Override
    public void execute() {
        commandsQueue.forEach(Command::execute);
    }
}