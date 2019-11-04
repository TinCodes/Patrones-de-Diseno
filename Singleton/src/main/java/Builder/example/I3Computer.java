package Builder.example;

public class I3Computer extends ComputerBuilder{
    @Override
    public void buildProcessor(){
        comp.setProcessor("i3");
    }

    @Override
    public void buildMemory(){
        comp.setMemory("8gb");
    }

    @Override
    public void buildGraphics(){
        comp.setGraphics("4gb");
    }

}
