package Mediator.example;

public class ConcreteFlight3 extends Flight {
    public ConcreteFlight3(ICommTower mediator){
        super(mediator);
    }

    @Override
    public void speak(String msj){
        mediator.send(msj, this);
    }

    @Override
    public void messageReceived(String msj){
        System.out.println("Plane 3 has received the message: " + msj) ;
    }
}
