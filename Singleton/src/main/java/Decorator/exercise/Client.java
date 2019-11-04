package Decorator.exercise;

public class Client {
    public static void main(String []args){
        Component comp = new Computer();
        comp = new GamingGraphicsCard(comp);
        comp = new GamingKeyboard(comp);
        comp = new GamingMouse(comp);
        comp = new SamsungScreen(comp);

        comp.operation();
    }
}
