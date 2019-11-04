package Mediator.example;

public class ConcreteFlight4 extends Flight {

    public ConcreteFlight4 (ICommTower mediator){
        super(mediator);
    }

    @Override
    public void speak(String msj){
        mediator.send(msj, this);
    }

    @Override
    public void messageReceived(String msj){
        System.out.println("Plane 4 has received the message: " + msj) ;
    }
}
