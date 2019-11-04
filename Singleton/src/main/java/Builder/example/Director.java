package Builder.example;

public class Director {
    private ComputerBuilder computerBuilder;

    public void setComputerBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer getComputer(){
        return computerBuilder.getComp();
    }

    public void buildComputer(){
        computerBuilder.create();
        computerBuilder.buildProcessor();
        computerBuilder.buildGraphics();
        computerBuilder.buildMemory();
    }
}
