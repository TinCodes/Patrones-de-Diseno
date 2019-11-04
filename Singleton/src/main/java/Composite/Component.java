package Composite;

public abstract class Component {
    private String att;
    public Component(String att){
        this.att = att;
        System.out.println("Constructor " + att);
    }

    public String getAtt(){
        return this.att;
    }

    public abstract void operation();
    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract void getChild(int pos);

}
