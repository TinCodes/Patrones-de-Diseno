package AbstractFactory;

public class FactoryProduct {
    public static IProduct make(String type){
        IProduct product;
        switch (type){
            case "product1":
                product = new ConcreteProduct1();
                break;

            case "product2":
                product = new ConcreteProduct2();
                break;

            default:
                product = new ConcreteProduct2();
                break;
        }
        return product;
    }
}
