package SegundoParcial.ChainOfResponsibility;

public class Dev implements IHandler {
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
        if (crit.equals(Query.FUNCIONALIDAD)){
            System.out.println("Developer: Iniciando con la nueva funcionalidad!");
            estimar();
        } else {
            next.criteriaHandler(crit);
        }
    }

    public void estimar(){
        System.out.println("El Dev se encuentra estimando la nueva funcionalidad...\n");
    }

}
