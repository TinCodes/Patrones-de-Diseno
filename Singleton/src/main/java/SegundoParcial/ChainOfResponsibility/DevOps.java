package SegundoParcial.ChainOfResponsibility;

public class DevOps implements IHandler {
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
        if (crit.equals(Query.INFRAESTRUCTURA)){
            System.out.println("DevOps: Listo para resolver su problema de infraestructura!");
            askForInfo();
        } else {
            next.criteriaHandler(crit);
        }
    }

    public void askForInfo(){
        System.out.println("DevOps solicita mas informacion acerca del error\n");
    }

}
