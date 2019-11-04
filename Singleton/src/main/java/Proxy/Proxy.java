package Proxy;

public class Proxy implements ISubject{
    private String att;
    private RealSubject realSubject = null;

    public Proxy(String att){
        this.att = att;
        realSubject = new RealSubject(att);
    }

    @Override
    public void request(){

        if (realSubject == null)
            realSubject = new RealSubject(att);

        // some condition // filters
        if (att.contains("filter")){
            this.realSubject.request();
        } else {
            System.out.println("Blocked");
        }
    }
}
