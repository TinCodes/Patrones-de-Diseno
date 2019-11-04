package Singleton.example;

public class Person {

    private String walk;
    private String hand;
    private String feet;
    private String head;

    public Person(){
        Logger.getInstance().writeLog("INFO", "Person is being created...");
    }

    public String getWalk() {
        return walk;
    }

    public void setWalk(String walk) {
        this.walk = walk;
        Logger.getInstance().writeLog("INFO", "Walking " + walk);
        Connection.getInstance().upload(walk);
    }

    public String getHand() {
        return hand;
    }

    public void setHand(String hand) {
        this.hand = hand;
        Logger.getInstance().writeLog("INFO", "Hand " + hand);
        Connection.getInstance().upload(hand);
    }

    public String getFeet() {
        return feet;
    }

    public void setFeet(String feet) {
        this.feet = feet;
        Logger.getInstance().writeLog("INFO", "Feet " + feet);
        Connection.getInstance().upload(feet);
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
        Logger.getInstance().writeLog("INFO", "Head " + head);
        Connection.getInstance().upload(head);
    }

}
