package SegundoParcial.ChainOfResponsibility;

public class ServicioSoftware implements IHandler {

    private IHandler next;

    @Override
    public void setNext(IHandler handler){
        next = handler;
    }

    @Override
    public IHandler next(){
        return next;
    }

    @Override
    public void criteriaHandler(Query crit){
        Dev usr1 = new Dev();
        this.setNext(usr1);

        QA handler2 = new QA();
        usr1.setNext(handler2);

        DevOps handler3 = new DevOps();
        handler2.setNext(handler3);

        Finanzas handler4 = new Finanzas();
        handler3.setNext(handler4);

        Support handler5 = new Support();
        handler4.setNext(handler5);

        next.criteriaHandler(crit);
    }


}
