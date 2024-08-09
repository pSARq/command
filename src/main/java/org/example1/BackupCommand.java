package org.example1;

public class BackupCommand implements Command {
    private final ServerOperation receiver;

    public BackupCommand(ServerOperation receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.performBackup();
    }
}
