package Decorator.exercise;

public class GamingGraphicsCard extends Decorator {

    private int price = 25;

    public GamingGraphicsCard(Component component){
        super(component);
        price += component.getPrice();
    }

    public void operation(){
        super.operation();
        System.out.println("Adding Gaming Graphics Card");
        System.out.println("Total Price: " + getPrice());
    }

    public int getPrice(){
        return price;
    }

}
