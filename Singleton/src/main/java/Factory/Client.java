package Factory;

public class Client {
    public  static void main(String []args){
        ConcreteProduct newProduct = new ConcreteCreator().factoryMethodProduct();
        ConcreteProduct2 otherProduct = new ConcreteCreator2().factoryMethodProduct();
    }
}
