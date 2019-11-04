package Proxy.exercise;

public class Banco implements ISubject {

    String moneda;
    int total;

    public Banco(String moneda, int total){
        this.moneda = moneda;
        this.total = total;
    }

    @Override
    public void retirar(int cantidad){
        System.out.println("Retirando " + this.moneda + " " + cantidad);
        total -= cantidad;
        System.out.println("Total: " + total);
    }

    @Override
    public void depositar(int cantidad){
        System.out.println("Depositando " + this.moneda + " " + cantidad);
        total += cantidad;
        System.out.println("Total: " + total);
    }

}
