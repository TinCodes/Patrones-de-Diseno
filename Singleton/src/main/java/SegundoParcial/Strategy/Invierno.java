package SegundoParcial.Strategy;

public class Invierno implements IStrategy {
    private int rebaja = 10;

    @Override
    public void execute(int precio){
        precio += (precio*rebaja)/100;
        System.out.println("Precio para Invierno: " + precio);
    }
}
