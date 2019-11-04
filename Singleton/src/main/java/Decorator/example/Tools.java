package Decorator.example;

public class Tools extends Decorator {

    public Tools(Ide ide){
        super(ide);
    }

    public void operation(){
        super.operation();
        addedBehavior();
        System.out.println("Tools");
    }

    public void addedBehavior(){
        System.out.println("Add new behavior of tools");
    }

}
