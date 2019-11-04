package Mediator.exercise;


public interface IMediator {
    public void send(String msj, int coderID);

    public void sendTo(String msj, int coderID);
}