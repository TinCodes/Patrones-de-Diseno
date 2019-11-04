package SegundoParcial.Strategy;

public class Verano implements IStrategy {
    private int rebaja = 10;

    @Override
    public void execute(int precio){
        precio -= (precio*rebaja)/100;
        System.out.println("Precio de Verano: " + precio);
    }
}
