package Mediator.example;

public class Client {

    public static void main(String []args){
        CommTowerGeneral mediator = new CommTowerGeneral();

        ConcreteFlight1 plane1 = new ConcreteFlight1(mediator);
        ConcreteFlight2 plane2 = new ConcreteFlight2(mediator);
        ConcreteFlight3 plane3 = new ConcreteFlight3(mediator);
        ConcreteFlight4 plane4 = new ConcreteFlight4(mediator);

        mediator.setFlight1(plane1);
        mediator.setFlight2(plane2);
        mediator.setFlight3(plane3);
        mediator.setFlight4(plane4);

        plane1.speak("Plane 1 Incoming");
        System.out.println();
        plane2.speak("Plane 2 Leaving");
        System.out.println();
        plane3.speak("Plane 3 is Out of order");
        System.out.println();
        plane4.speak("Plane 4 is Missing");

    }

}
