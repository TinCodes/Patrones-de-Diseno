package SegundoParcial.Memento;

public class Client {
    public static void main(String [] args){
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();
        ConcreteObject concreteObject;

        concreteObject = new ConcreteObject("Games", "State 1");
        originator.setMemento(concreteObject);

        concreteObject = new ConcreteObject("Games", "State 2");
        originator.setMemento(concreteObject);

        careTaker.addMemento(originator.createMemento());

        concreteObject = new ConcreteObject("Games", "State 3");
        originator.setMemento(concreteObject);

        careTaker.addMemento(originator.createMemento());

        concreteObject = new ConcreteObject("Games", "State 4");
        originator.setMemento(concreteObject);

        originator.restoreFromMemento(careTaker.getMemento(0));

    }
}
