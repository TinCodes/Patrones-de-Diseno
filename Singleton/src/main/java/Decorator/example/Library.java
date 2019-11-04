package Decorator.example;

public class Library extends Decorator {
    private String att1;

    public Library(Ide ide){
        super(ide);
    }

    public void operation(){
        super.operation();
        this.att1 = "Library";
        System.out.println("Adding Library" + att1);
    }

}
