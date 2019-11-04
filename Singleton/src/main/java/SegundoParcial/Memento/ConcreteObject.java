package SegundoParcial.Memento;

public class ConcreteObject {
    private String name;
    private String state;

    public ConcreteObject(String name, String state){
        this.name = name;
        this.state = state;
    }

    public void show(){
        System.out.println("Current values --> Name: " + name + "\nState: " + state);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
