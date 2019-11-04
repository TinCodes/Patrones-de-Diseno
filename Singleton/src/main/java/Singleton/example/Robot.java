package Singleton.example;

public class Robot {

    private String walk;
    private String hand;
    private String feet;
    private String head;

    public Robot(){
        Logger.getInstance().writeLog("INFO", "Creating Robot...");
    }

    public String getWalk() {
        return walk;
    }

    public void setWalk(String walk) {
        this.walk = walk;
        Logger.getInstance().writeLog("INFO", "Walking.exe: " + walk);
        Connection.getInstance().upload(walk);
    }

    public String getHand() {
        return hand;
    }

    public void setHand(String hand) {
        this.hand = hand;
        Logger.getInstance().writeLog("INFO", "Hand.exe: " + hand);
        Connection.getInstance().upload(hand);
    }

    public String getFeet() {
        return feet;
    }

    public void setFeet(String feet) {
        this.feet = feet;
        Logger.getInstance().writeLog("INFO", "Feet.exe: " + feet);
        Connection.getInstance().upload(feet);
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
        Logger.getInstance().writeLog("INFO", "Head.exe: " + head);
        Connection.getInstance().upload(head);
    }

}
