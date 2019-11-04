package SegundoParcial.Strategy;

public class Primavera implements IStrategy {


    @Override
    public void execute(int precio){
        System.out.println("Precio de Primavera: " + precio);
    }
}
