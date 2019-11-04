package Mediator.exercise;

public class ConcreteCoder1 extends Coder {
    public ConcreteCoder1(IMediator mediator){
        super(mediator);
    }

    @Override
    public void send(String msg){
        System.out.println(msg);
        mediator.send(msg,1);
    }

    @Override
    public void sendTo(String msj, int coderID){
        System.out.println(msj);
        mediator.sendTo(msj,coderID);
    }

    @Override
    public void messageReceived(){
        System.out.println("Sent to 1");
    }


}
