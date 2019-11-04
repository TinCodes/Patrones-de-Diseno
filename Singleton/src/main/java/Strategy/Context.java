package Strategy;

public class Context {

    private IStrategy strategy;
    private int att1;
    private String att2;


    public Context(){

    }

    public IStrategy getStrategy(){
        return strategy;
    }

    public void setAtt1(int att1){
        this.att1 = att1;
        if (this.att1 <= 10)
            defineStrat1();
        else
            defineStrat2();
    }

    public void setStrategy(IStrategy strategy){
        this.strategy = strategy;
    }

    public void defineStrat1(){
        this.strategy = new ConcreteStrategy1();
    }

    public void defineStrat2(){
        this.strategy = new ConcreteStrategy2();
    }

    public void execute(){
        strategy.execute();
    }
}
