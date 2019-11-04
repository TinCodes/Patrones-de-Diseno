package Mediator.exercise;

public class ConcreteCoder0 extends Coder {
    public ConcreteCoder0(IMediator mediator){
        super(mediator);
    }

    @Override
    public void send(String msg){
        System.out.println(msg);
        mediator.send(msg,0);
    }

    @Override
    public void sendTo(String msj, int coderID){
        System.out.println(msj);
        mediator.sendTo(msj,coderID);
    }

    @Override
    public void messageReceived(){
        System.out.println("Sent to 0");
    }


}
