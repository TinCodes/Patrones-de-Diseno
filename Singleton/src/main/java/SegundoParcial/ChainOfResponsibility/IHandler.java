package SegundoParcial.ChainOfResponsibility;

public interface IHandler {

    public void setNext(IHandler handler);  // para ir al siguiente encargado de la responsabilidad
    public IHandler next();                 // ir al siguiente
    public void criteriaHandler(Query crit); // criterio para moverse en la cadena de responsabilidad

}
