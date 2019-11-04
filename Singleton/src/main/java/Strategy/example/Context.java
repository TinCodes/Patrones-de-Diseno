package Strategy.example;

public class Context {

    private IStrategy strategy;
    private int situacion;
    private boolean tiroLibre;
    private int time;


    public Context(){
        defineStrat2();
    }

    public IStrategy getStrategy(){
        return strategy;
    }

    public void setTime(int time){
        this.time = time;
        if (!tiroLibre) {
            if (this.time <= 10) {
                defineStrat2();
            } else if (this.time <= 50 && this.time >= 45) {
                defineStrat4();
            } else if (this.time >= 80) {
                defineStrat1();
            } else if (this.time == 90){
                System.out.println("Fin del partido");
            }
        }  else {
            defineStrat3();
        }
        System.out.println("Tiempo: " + this.time);
    }

    public void setTiroLibre(boolean tiroLibre){
        this.tiroLibre = tiroLibre;
        if (tiroLibre)
            defineStrat3();
        else
            defineStrat2();
    }

    public void setStrategy(IStrategy strategy){
        this.strategy = strategy;
    }

    public void defineStrat1(){
        this.strategy = new Ataque();
        execute();
    }

    public void defineStrat2(){
        this.strategy = new Defensa();
        execute();
    }

    public void defineStrat3(){
        this.strategy = new TiroLibre();
        execute();
    }

    public void defineStrat4(){
        this.strategy = new Contragolpe();
        execute();
    }

    public void execute(){
        strategy.execute();
    }
}
