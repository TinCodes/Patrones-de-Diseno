package Mediator;

public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(IMediator mediator){
        super(mediator);
    }

    @Override
    public void send(String msj){
        mediator.send(msj, this);
    }

    @Override
    public void messageReceived(String msj){
        System.out.println("Colleague 1 has received the message: " + msj) ;
    }
}
