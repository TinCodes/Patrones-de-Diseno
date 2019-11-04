package Mediator;

public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(IMediator mediator){
        super(mediator);
    }

    @Override
    public void send(String msj){
        mediator.send(msj, this);
    }

    @Override
    public void messageReceived(String msj){
        System.out.println("Colleague 2 has received the message: " + msj) ;
    }
}
