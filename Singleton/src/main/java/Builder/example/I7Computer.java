package Builder.example;

public class I7Computer extends ComputerBuilder{
    @Override
    public void buildProcessor(){
        comp.setProcessor("i7");
    }

    @Override
    public void buildMemory(){
        comp.setMemory("32gb");
    }

    @Override
    public void buildGraphics(){
        comp.setGraphics("8gb");
    }
}
