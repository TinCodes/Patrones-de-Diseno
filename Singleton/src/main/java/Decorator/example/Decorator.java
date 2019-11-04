package Decorator.example;

public abstract class Decorator implements Ide {
    private Ide ide;

    public Decorator(Ide ide){
        this.ide = ide;
    }

    public void operation(){
        ide.operation();
    }
}
