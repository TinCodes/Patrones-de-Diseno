package Builder;

public class Client {
    public static void main(String []args){
        Director director = new Director();

        Builder builder = new ConcreteProduct();

        director.setBuilder(builder);
        director.buildProduct();

        Product product = director.getProduct();
    }
}
