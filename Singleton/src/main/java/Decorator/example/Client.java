package Decorator.example;

public class Client {
    public static void main(String []args){
        Ide eclipse2019 = new Eclipse();
        eclipse2019 = new Library(eclipse2019);
        eclipse2019 = new Plugin(eclipse2019);
        eclipse2019 = new Tools(eclipse2019);

        eclipse2019.operation();
    }
}
