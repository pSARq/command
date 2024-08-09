package org.example1;

/*En el patrón esta es la clase Receiver.
* Contiene la logica de negocio*/
public class ConcreteServerOperation implements ServerOperation {
    @Override
    public void performBackup() {
        System.out.println("Realizando copia de seguridad...");
    }

    @Override
    public boolean isServiceRunning(String serviceName) {
        System.out.println("El servicio " + serviceName + " está en ejecución");
        return true;
    }

    @Override
    public void startService(String serviceName) {
        System.out.println("Iniciando servicio " + serviceName);
    }

    @Override
    public void stopService(String serviceName) {
        System.out.println("Apagando servicio " + serviceName);
    }

    @Override
    public void cleanLogs() {
        System.out.println("Limpiando logs...");
    }
}
