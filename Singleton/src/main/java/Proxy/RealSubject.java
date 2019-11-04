package Proxy;

public class RealSubject implements ISubject {

    String att;

    public RealSubject(String att){
        this.att = att;
    }

    @Override
    public void request(){
        System.out.println("Request Real Subject: " + this.att);
    }

}
