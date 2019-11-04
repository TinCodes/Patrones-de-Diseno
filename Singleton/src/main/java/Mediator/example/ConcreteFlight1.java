package Mediator.example;

public class ConcreteFlight1 extends Flight {

    public ConcreteFlight1(ICommTower mediator){
        super(mediator);
    }

    @Override
    public void speak(String msj){
        mediator.send(msj, this);
    }

    @Override
    public void messageReceived(String msj){
        System.out.println("Plane 1 has received the message: " + msj) ;
    }
}
