package TemplateMethod;

public class ConcreteClass1 extends AbstractClass {
    @Override
    void method1(){
        System.out.println("Method 1");
    }

    @Override
    void method2(){
        System.out.println("Method 2");
    }

    @Override
    public void templateMethod2(){
        System.out.println("Template Method 2 Overwrite");
    }
}
