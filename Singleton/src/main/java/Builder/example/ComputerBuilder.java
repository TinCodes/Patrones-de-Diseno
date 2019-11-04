package Builder.example;

public abstract class ComputerBuilder {
    protected Computer comp;

    public Computer getComp(){
        return comp;
    }

    public void create(){
        comp = new Computer();
    }

    public abstract void buildProcessor();
    public abstract void buildMemory();
    public abstract void buildGraphics();
}
