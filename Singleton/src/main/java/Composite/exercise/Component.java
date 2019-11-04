package Composite.exercise;

public abstract class Component {
    private int est;
    private int val;

    public Component(int est){
        this.est = est;
    }

    public int getVal(){
        return this.val;
    }

    public int getEst(){
        return this.est;
    }

    public void setEst(int est){
        this.est = est;
    }

    public abstract void estimacion();
    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract void getChild(int pos);

}
