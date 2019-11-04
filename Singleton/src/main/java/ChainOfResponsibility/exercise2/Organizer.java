package ChainOfResponsibility.exercise2;

public class Organizer implements IHandler {

    private IHandler next;
    private int soFar = 0;

    @Override
    public void setNext(IHandler handler){
        next = handler;
    }

    @Override
    public IHandler next(){
        return next;
    }

    @Override
    public void criteriaHandler(int amount){

        soFar += amount;

        Cajero usr1 = new Cajero();
        this.setNext(usr1);

        AgenteCredito usr2 = new AgenteCredito();
        usr1.setNext(usr2);

        Supervisor usr3 = new Supervisor();
        usr2.setNext(usr3);

        AgentePrestamos usr4 = new AgentePrestamos();
        usr3.setNext(usr4);

        next.criteriaHandler(soFar);
    }


}
