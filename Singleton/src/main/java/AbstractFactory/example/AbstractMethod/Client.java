package AbstractFactory.example.AbstractMethod;

public class Client {

    public static void main(String []args){
    //  Interface way
    /*
        FactoryProduct.make(Browsers.CHROME).operation();
        FactoryProduct.make(Browsers.IE).operation();
        FactoryProduct.make(Browsers.FIREFOX).operation();
    */

    //  Abstract Class way
        FactoryProduct.make(Browsers.CHROME).make();
        FactoryProduct.make(Browsers.FIREFOX).make();
        FactoryProduct.make(Browsers.IE).make();
    }



}
