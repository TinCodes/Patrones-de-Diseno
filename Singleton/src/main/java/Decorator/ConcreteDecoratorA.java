package Decorator;

public class ConcreteDecoratorA extends Decorator {
    private String att1;

    public ConcreteDecoratorA(Component component){
        super(component);
    }

    public void operation(){
        super.operation();
        this.att1 = "New Property";
        System.out.println("Adding Decorator " + att1);
    }

}
