package Mediator;

public abstract class Colleague {
    protected IMediator mediator;

    public Colleague(IMediator mediator){
        this.mediator = mediator;

    }

    public abstract void send(String msj);

    public abstract void messageReceived(String msj);
}
