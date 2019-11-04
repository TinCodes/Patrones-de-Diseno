package Composite;

public class Leaf1 extends Component {

    public Leaf1(String att) {
        super(att);
    }

    @Override
    public void operation() {
        System.out.println("\t\t Item 2: " + this.getAtt());
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
        System.out.println("\t\t Item 2: " + this.getAtt());
    }
}
