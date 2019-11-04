package SegundoParcial.Strategy;

public class Otono implements IStrategy {
    private int rebaja = 50;

    @Override
    public void execute(int precio){
        precio -= (precio*rebaja)/100;
        System.out.println("Precio de Otono: " + precio);
    }
}
