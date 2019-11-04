package Mediator.exercise;


import java.util.HashMap;

public class ConcreteMediator implements IMediator {
    private HashMap<Integer,Coder> coders = new HashMap<>();
    private int pos = 0;

    public void setCoder(Coder coder){
        coders.put(pos++,coder);
    }

    @Override
    public void send(String msj, int coderID){
        switch (coderID){
            case 0:
                coders.get(1).messageReceived();
                coders.get(2).messageReceived();
                break;
            case 1:
                coders.get(0).messageReceived();
                coders.get(2).messageReceived();
                break;
            case 2:
                coders.get(0).messageReceived();
                coders.get(1).messageReceived();
                break;
            default:
                break;
        }
    }

    @Override
    public void sendTo(String msj, int coderID){
        switch (coderID) {
            case 0:
                coders.get(0).messageReceived();
                break;
            case 1:
                coders.get(1).messageReceived();
                break;
            case 2:
                coders.get(2).messageReceived();
                break;
            default:
                break;
        }

    }

}
