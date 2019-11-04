package Decorator.example;

public class Plugin extends Decorator {
    private String att1;

    public Plugin(Ide ide){
        super(ide);
    }

    public void operation(){
        super.operation();
        addedBehavior();
        System.out.println("Plugins");
    }

    public void addedBehavior(){
        System.out.println("Add new behavior of Plugin");
    }

}
