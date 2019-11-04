package Builder.example;

public class I5Computer extends ComputerBuilder{
    @Override
    public void buildProcessor(){
        comp.setProcessor("i5");
    }

    @Override
    public void buildMemory(){
        comp.setMemory("16gb");
    }

    @Override
    public void buildGraphics(){
        comp.setGraphics("6gb");
    }
}
