package Proxy.example;

public class Proxy implements IServer {
    private Request request;
    private Server server = null;

    public Proxy(Request request){
        this.request = request;
        server = new Server(request);
    }

    @Override
    public void request(){

        if (server == null)
            server = new Server(request);

        // some condition // filters
        if (request.getUrl().equals("80")){
            this.server.request();
        } else {
            System.out.println("Blocked");
        }
    }
}
