package org.example2;

public class Main {
    public static void main(String[] args) {
        /*Este ejemplo es similar al primero, pero la logica de negocio está dentro de cada command, asi
        * ya no es necesario crear la otra clase separada.
        * En cuanto al gestor de commands, en este caso, en vez de crear una interfaz y una implementación
        * por aparte, se creó una implementación del mismo command el cual se encarga
        * de administrar a varios commands si se llega a necesitar, el problema es que asi como esta en este momento
        * siempre que se le quiera pasar mas commands a ese gestor toca es crear una nueva instancia y pasarlos
        * por el constructor, mientras que el del primer ejemplo ejecuta y elimina permitiendo que ese mismo objeto
        * se pueda usar con mas commands*/

        Command backup = new BackupCommand();
        Command restartService = new RestartServiceCommand("DatabaseService");
        Command cleanLogs = new CleanLogsCommand();
        Command invoker = new SimpleCommandManager(backup, restartService, cleanLogs);

        invoker.execute();
    }
}