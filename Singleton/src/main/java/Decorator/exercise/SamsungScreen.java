package Decorator.exercise;

public class SamsungScreen extends Decorator {

    private int price = 50;

    public SamsungScreen(Component component){
        super(component);
        price += component.getPrice();
    }

    public void operation(){
        super.operation();
        System.out.println("Adding new Samsung Screen");
        System.out.println("Total Price: " + getPrice());
    }

    public int getPrice(){
        return price;
    }

}
