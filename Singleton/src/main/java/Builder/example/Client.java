package Builder.example;

public class Client {
    public static void main(String []args){
        Director director = new Director();

        ComputerBuilder builderI3 = new I3Computer();
        ComputerBuilder builderI5 = new I5Computer();
        ComputerBuilder builderI7 = new I7Computer();

        director.setComputerBuilder(builderI3);
        director.buildComputer();
        Computer comp1 = director.getComputer();

        director.setComputerBuilder(builderI5);
        director.buildComputer();
        Computer comp2 = director.getComputer();

        director.setComputerBuilder(builderI7);
        director.buildComputer();
        Computer comp3 = director.getComputer();


    }
}
