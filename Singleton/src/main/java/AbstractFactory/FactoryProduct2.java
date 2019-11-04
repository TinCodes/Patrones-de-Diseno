package AbstractFactory;

public class FactoryProduct2 {
    public static IProduct make(Products type){
        IProduct product;
        switch (type){
            case CONCRETE1:
                product = new ConcreteProduct1();
                break;

            case CONCRETE2:
                product = new ConcreteProduct2();
                break;
            case CONCRETE3:
                product = new ConcreteProduct3();
                break;

            default:
                product = new ConcreteProduct4();
        }
        return product;
    }
}
