package ChainOfResponsibility.exercise2;

public interface IHandler {
    public int prestamo = 1000;
    public void setNext(IHandler handler);  // para ir al siguiente encargado de la responsabilidad
    public IHandler next();                 // ir al siguiente
    public void criteriaHandler(int amount); // criterio para moverse en la cadena de responsabilidad

}
