package Composite;

public class Leaf extends Component {

    public Leaf(String att) {
        super(att);
    }

    @Override
    public void operation() {
        System.out.println("\t Item: " + this.getAtt());
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
        System.out.println("\t Item: " + this.getAtt());
    }
}
