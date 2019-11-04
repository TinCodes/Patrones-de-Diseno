package Visitor;

public interface IElement {
    public double accept(IVisitor visitor);
    public String method1();
    public String method2();
    public int method3();

}
