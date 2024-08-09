package org.example1;

/*Los command contienen cierta logica pero mas que todo sirve como intermediarios entre el Invoker y el
Receiver, es decir, solo llaman los metodos que necesita, pero como tal la logica de negocio esta en el Receiver*/
public class RestartServiceCommand implements Command {
    private final ServerOperation receiver;
    private final String serviceName;

    public RestartServiceCommand(ServerOperation receiver, String serviceName) {
        this.receiver = receiver;
        this.serviceName = serviceName;
    }

    @Override
    public void execute() {
        if (receiver.isServiceRunning(serviceName)) {
            receiver.stopService(serviceName);
        }

        receiver.startService(serviceName);
    }
}
