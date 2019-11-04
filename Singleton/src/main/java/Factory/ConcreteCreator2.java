package Factory;

public class ConcreteCreator2 extends Creator{
    @Override
    public ConcreteProduct2 factoryMethodProduct(){
        ConcreteProduct2 concreteProduct = new ConcreteProduct2();
        Base3 base3 = new Base3();
        Base4 base4 = new Base4();
        concreteProduct.setBase3(base3);
        concreteProduct.setBase4(base4);
        return concreteProduct;
    }
}
