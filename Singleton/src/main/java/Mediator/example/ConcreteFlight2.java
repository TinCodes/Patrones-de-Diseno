package Mediator.example;

public class ConcreteFlight2 extends Flight{
    public ConcreteFlight2(ICommTower mediator){
        super(mediator);
    }

    @Override
    public void speak(String msj){
        mediator.send(msj, this);
    }

    @Override
    public void messageReceived(String msj){
        System.out.println("Plane 2 has received the message: " + msj) ;
    }
}
