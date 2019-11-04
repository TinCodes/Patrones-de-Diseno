package Proxy.exercise;

public class Proxy implements ISubject {
    private String moneda;
    private int cantidad = 1000;
    private Banco banco = null;

    public Proxy(String moneda){
        this.moneda = moneda;
        banco = new Banco(moneda,cantidad);
    }

    @Override
    public void retirar(int cantidad){
        if (banco == null)
            banco = new Banco(moneda,this.cantidad);
        // some condition // filters
        if (banco.moneda.equals("Bolivianos")) {
            this.banco.retirar(cantidad);
        } else {
            System.out.println("No se acepta este tipo de moneda, podria utilizar: Bolivianos");
        }
    }

    @Override
    public void depositar(int cantidad){
        if (banco == null)
            banco = new Banco(moneda,this.cantidad);

        // some condition // filters
        if (banco.moneda.equals("Bolivianos")) {
            this.banco.depositar(cantidad);
        } else {
            System.out.println("No se acepta este tipo de moneda, podria utilizar: Bolivianos");
        }
    }
}
