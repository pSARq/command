package org.example2;

public class BackupCommand implements Command {
    @Override
    public void execute() {
        performBackup();
    }

    private void performBackup() {
        System.out.println("Realizando copia de seguridad...");
    }
}
