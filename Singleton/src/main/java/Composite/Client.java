package Composite;

public class Client {

    public static void main(String []args) {
        Composite composite = new Composite("composite root1");
        composite.add(new Leaf("leaf1"));
        composite.add(new Leaf("leaf2"));
        composite.add(new Leaf1("leaf3"));
        composite.add(new Leaf("leaf1"));
        composite.add(new Leaf("leaf2"));
        composite.add(new Leaf1("leaf3"));

        Composite composite1 = new Composite("composite root2");
        composite.add(new Leaf("Nleaf1"));
        composite.add(new Leaf("Nleaf2"));
        composite.add(new Leaf1("Nleaf3"));
        composite.add(new Leaf("Nleaf1"));
        composite.add(new Leaf("Nleaf2"));
        composite.add(new Leaf1("Nleaf3"));
        composite.add(composite1);

        composite.operation();
    }
}
