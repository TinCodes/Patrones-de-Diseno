package Prototype;

public class Main {

    public static void main(String []args) {
        ConcretePrototype a = new ConcretePrototype();

        a.setFeet("RobotValueA");
        System.out.println("Robot A " + a.getFeet());

        ConcretePrototype b = new ConcretePrototype();
        // This (below) just changes the pointer, so a and b are pointing to the same instance
        // this way b changes a and this should not be.
        // b = a;
        b = (ConcretePrototype) a.clone();
        // Cloning the object solves this issue, use Prototype

        System.out.println("Robot B " + b.getFeet());
        b.setFeet("RobotValueB");

        System.out.println("Robot A " + a.getFeet());
        System.out.println("Robot B " + b.getFeet());
    }
}
