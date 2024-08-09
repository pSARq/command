package org.example2;

public class RestartServiceCommand implements Command {
    private final String serviceName;

    public RestartServiceCommand(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public void execute() {
        if (isServiceRunning(serviceName)) {
            stopService(serviceName);
        }

        startService(serviceName);
    }

    public boolean isServiceRunning(String serviceName) {
        System.out.println("El servicio " + serviceName + " está en ejecución");
        return true;
    }

    public void startService(String serviceName) {
        System.out.println("Iniciando servicio " + serviceName);
    }

    public void stopService(String serviceName) {
        System.out.println("Apagando servicio " + serviceName);
    }
}
