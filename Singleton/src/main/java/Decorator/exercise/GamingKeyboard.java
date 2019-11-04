package Decorator.exercise;

public class GamingKeyboard extends Decorator {

    private int price = 10;

    public GamingKeyboard(Component component){
        super(component);
        price += component.getPrice();
    }

    public void operation(){
        super.operation();
        System.out.println("Adding Gaming Keyboard");
        System.out.println("Total Price: " + getPrice());
    }

    public int getPrice(){
        return price;
    }

}
