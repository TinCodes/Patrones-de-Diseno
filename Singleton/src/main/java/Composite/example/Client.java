package Composite.example;

public class Client {

    public static void main(String []args) {
        Composite kitProduct1 = new Composite("KitProduct 1");
        kitProduct1.add(new Product("Product1"));
        kitProduct1.add(new Product("Product2"));
        kitProduct1.add(new Product("Product3"));

        Composite kitProduct2 = new Composite("KitProduct 2");
        kitProduct2.add(new Product1("Product1"));
        kitProduct2.add(new Product1("Product2"));
        kitProduct2.add(new Product1("Product3"));

        Composite boxProduct = new Composite("BoxProduct");
        boxProduct.add(kitProduct1);
        boxProduct.add(kitProduct2);

        boxProduct.print();
    }
}
