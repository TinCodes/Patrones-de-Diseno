package Mediator.example;

public abstract class Flight {
    protected ICommTower mediator;

    public Flight(ICommTower mediator){
        this.mediator = mediator;
    }

    public abstract void speak(String msj);

    public abstract void messageReceived(String msj);
}
