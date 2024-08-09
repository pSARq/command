package org.example2;

public class CleanLogsCommand implements Command {
    @Override
    public void execute() {
        cleanLogs();
    }

    public void cleanLogs() {
        System.out.println("Limpiando logs...");
    }
}
