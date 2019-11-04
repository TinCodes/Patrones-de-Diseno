package Composite.example;

public class Product1 extends Component {
    public Product1(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("\t Product1: " + this.getName());
    }

    @Override
    public void add(Component component) {
        System.out.println("Not applicable on Item");
    }

    @Override
    public void remove(Component component) {
        System.out.println("Not applicable on Item");
    }

    @Override
    public void getChild(int pos) {
        System.out.println("\t Product1: " + this.getName());
    }
}
