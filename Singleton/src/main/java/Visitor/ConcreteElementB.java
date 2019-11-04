package Visitor;

public class ConcreteElementB implements IElement {
    private String att1;
    private int att2;
    public int getAtt2(){
        return att2;
    }
    public void setAtt2(int att2){
        this.att2 = att2;
    }

    @Override
    public double accept(IVisitor visitor){
        return visitor.visit(this);
    }

    @Override
    public String method1(){
        return null;
    }

    @Override
    public String method2(){
        return null;
    }

    @Override
    public int method3(){
        return 0;
    }
}
