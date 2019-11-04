package Mediator.exercise;

public abstract class Coder {
    protected IMediator mediator;

    public Coder(IMediator mediator){
        this.mediator = mediator;

    }

    public abstract void send(String msj);

    public abstract void sendTo(String msj, int coderID);

    public abstract void messageReceived();

}
