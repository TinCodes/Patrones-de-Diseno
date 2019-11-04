package Decorator.exercise;

public class Computer implements Component {

    public void operation() {
        System.out.println("Creating new Computer");
        System.out.println("Total Price: " + getPrice());
    }

    @Override
    public int getPrice() {
        return price;
    }

}
