package Visitor;

public class ConcreteVisitor implements IVisitor {
    @Override
    public double visit(ConcreteElementA concreteElementA){
        //some process
        System.out.println("Some process Visitor Element A");
        concreteElementA.getAtt2();
        return 0;
    }

    @Override
    public double visit(ConcreteElementB concreteElementB){
        concreteElementB.getAtt2();
        System.out.println("Some Process Visitor Element B");
        // some process
        return 0;
    }
}
