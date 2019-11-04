package Singleton.example;

public class Client {

    public static void main(String []args){

        Thread robotThread = new Thread(new Runnable() {
            @Override
            public void run() {
                Robot rob1 = new Robot();

                rob1.setHead("Turn Right");
                rob1.setWalk("Forward");
                rob1.setHand("Up");
                rob1.setFeet("Twist");
            }
        });

        Thread personThread = new Thread(new Runnable() {
            @Override
            public void run() {
                Person person1 = new Person();

                person1.setHead("Turn Right");
                person1.setWalk("Forward");
                person1.setHand("Up");
                person1.setFeet("Twist");
            }
        });

//        robotThread.start();
//        personThread.start();

        System.out.println("------------------------------ IPrototype.IPrototype ----------------------------------\n");

        // What not to do:

        Robot a = new Robot();
        a.setFeet("RobotValueA");

        System.out.println("Robot A " + a.getFeet());

        Robot b = new Robot();
        // This just changes the pointer, so a and b are pointing to the same instance
        // this way b changes a and this should not be.
        b = a;

        System.out.println("Robot B " + b.getFeet());
        b.setFeet("RobotValueB");

        System.out.println("Robot A " + a.getFeet());
        System.out.println("Robot B " + b.getFeet());








    }
}
