package org.example1;

public class CleanLogsCommand implements Command {
    private final ServerOperation receiver;

    public CleanLogsCommand(ServerOperation receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.cleanLogs();
    }
}
