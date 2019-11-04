package SegundoParcial.ChainOfResponsibility;

public class Client {
    public static void main(String []args){
        ServicioSoftware organizer = new ServicioSoftware();
        organizer.criteriaHandler(Query.COSTOS);
        organizer.criteriaHandler(Query.BUG_MEJORA);
        organizer.criteriaHandler(Query.INFRAESTRUCTURA);
        organizer.criteriaHandler(Query.FUNCIONALIDAD);
        organizer.criteriaHandler(Query.OTROS);
    }
}
