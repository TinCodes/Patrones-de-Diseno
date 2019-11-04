package Decorator;

public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component){
        super(component);
    }

    public void operation(){
        super.operation();
        addedBehavior();
        System.out.println("Decorator B");
    }

    public void addedBehavior(){
        System.out.println("Add new behavior");
    }

}
