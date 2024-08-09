package org.example1;

public class Main {
    public static void main(String[] args) {
        /*En este ejemplo se usa el patron de manera completa, donde se implementan todas las clases del patrón,
        pero investigando veo una manera más común y simple de usarlo, lo dejo en el ejemplo 2*/

        ServerOperation receiver = new ConcreteServerOperation();
        CommandManager invoker = new SimpleCommandManager();
        Command backup = new BackupCommand(receiver);
        Command restartService = new RestartServiceCommand(receiver, "DatabaseService");
        Command cleanLogs = new CleanLogsCommand(receiver);

        invoker.addCommand(backup);
        invoker.addCommand(restartService);
        invoker.addCommand(cleanLogs);

        invoker.executeCommands();
    }
}