package SegundoParcial.ChainOfResponsibility;

public class QA implements IHandler {
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
        if (crit.equals(Query.BUG_MEJORA)){
            System.out.println("QA: Enseguida se evaluara el bug!");
            aislarError();
        } else {
            next.criteriaHandler(crit);
        }
    }

    public void aislarError(){
        System.out.println("El error esta siendo aislado...\n");
    }

}
