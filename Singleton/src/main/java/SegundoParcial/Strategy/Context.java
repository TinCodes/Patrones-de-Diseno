package SegundoParcial.Strategy;

public class Context {

    private IStrategy strategy;
    private Estaciones estacion;
    private int precio = 100;
    private String tipo;

    public Context(int precio){
        this.precio = precio;
    }

    public IStrategy getStrategy(){
        return strategy;
    }

    public void setEstacion(Estaciones estacion){
        this.estacion = estacion;
        switch (this.estacion){
            case INVIERNO:
                defineInv();
                break;
            case PRIMAVERA:
                definePrim();
                break;
            case OTONO:
                defineOto();
                break;
            case VERANO:
                defineVeran();
                break;

            default:
                definePrim();
                break;
        }
    }

    public void setStrategy(IStrategy strategy){
        this.strategy = strategy;
    }

    public void defineInv(){
        this.strategy = new Invierno();
        execute();
    }

    public void definePrim(){
        this.strategy = new Primavera();
        execute();
    }

    public void defineOto(){
        this.strategy = new Otono();
        execute();
    }

    public void defineVeran(){
        this.strategy = new Verano();
        execute();
    }

    public void execute(){
        strategy.execute(precio);
    }
}
