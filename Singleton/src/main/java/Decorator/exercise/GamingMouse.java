package Decorator.exercise;

public class GamingMouse extends Decorator {

    private int price = 15;

    public GamingMouse(Component component){
        super(component);
        price += component.getPrice();
    }

    public void operation(){
        super.operation();
        System.out.println("Adding Gaming Mouse");
        System.out.println("Total Price: " + getPrice());
    }

    public int getPrice(){
        return price;
    }

}
