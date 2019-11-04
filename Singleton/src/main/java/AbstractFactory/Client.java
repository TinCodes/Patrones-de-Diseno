package AbstractFactory;

public class Client {

    public static void main(String []args){

        FactoryProduct2.make(Products.CONCRETE1).operation();

    }
}
