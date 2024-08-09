package org.example1;

/*Esta interfaz en el patron es la que se encarga de definir la logica de negocio, lo hago en una interfaz
* para permitir que los commands reciban cualquier implementación de esta o si se desea tambien de otra interfaz
* al igual que esta y evito que dependan directamente de una clase concreta*/
public interface ServerOperation {
    void performBackup();
    boolean isServiceRunning(String serviceName);
    void startService(String serviceName);
    void stopService(String serviceName);
    void cleanLogs();
}
