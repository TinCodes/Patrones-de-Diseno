package Factory;

public class ConcreteCreator extends Creator{
    @Override
    public ConcreteProduct factoryMethodProduct(){
        // This is where magic happens, you just need to assemble
        // things here for the new finished object so you don't
        // do this process at main().
        ConcreteProduct concreteProduct = new ConcreteProduct();
        Base1 base1 = new Base1();
        Base2 base2 = new Base2();
        concreteProduct.setBase1(base1);
        concreteProduct.setBase2(base2);
        return concreteProduct;
    }
}
