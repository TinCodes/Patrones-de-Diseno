package Mediator.example;

public class CommTowerGeneral implements ICommTower {
    private ConcreteFlight1 plane1;
    private ConcreteFlight2 plane2;
    private ConcreteFlight3 plane3;
    private ConcreteFlight4 plane4;

    public void setFlight1(ConcreteFlight1 flight1){
        plane1 = flight1;
    }

    public void setFlight2(ConcreteFlight2 flight2){
        plane2 = flight2;
    }

    public void setFlight3(ConcreteFlight3 flight3){
        plane3 = flight3;
    }

    public void setFlight4(ConcreteFlight4 flight4){
        plane4 = flight4;
    }

    @Override
    public void send(String msj, Flight flight){
        if (flight.equals(plane1)) {
            plane2.messageReceived(msj);
            plane3.messageReceived(msj);
            plane4.messageReceived(msj);
        } else if (flight.equals(plane2)) {
            plane1.messageReceived(msj);
            plane3.messageReceived(msj);
            plane4.messageReceived(msj);
        } else if (flight.equals(plane3)) {
            plane1.messageReceived(msj);
            plane2.messageReceived(msj);
            plane4.messageReceived(msj);
        } else if (flight.equals(plane4)) {
            plane1.messageReceived(msj);
            plane2.messageReceived(msj);
            plane3.messageReceived(msj);
        }

    }
}
