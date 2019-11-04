package Prototype;

public class ConcretePrototype implements IPrototype {

    private int att1;
    private String att2;
    private String walk;
    private String hand;
    private String feet;
    private String head;


    public ConcretePrototype(){

    }

    public int getAtt1() {
        return att1;
    }

    public void setAtt1(int att1) {
        this.att1 = att1;
    }

    public String getAtt2() {
        return att2;
    }

    public void setAtt2(String att2) {
        this.att2 = att2;
    }

    public String getWalk() {
        return walk;
    }

    public void setWalk(String walk) {
        this.walk = walk;
        //Logger.getInstance().writeLog("INFO", "Walking.exe: " + walk);
        //Connection.getInstance().upload(walk);
    }

    public String getHand() {
        return hand;
    }

    public void setHand(String hand) {
        this.hand = hand;
        //Logger.getInstance().writeLog("INFO", "Hand.exe: " + hand);
        //Connection.getInstance().upload(hand);
    }

    public String getFeet() {
        return feet;
    }

    public void setFeet(String feet) {
        this.feet = feet;
        //Logger.getInstance().writeLog("INFO", "Feet.exe: " + feet);
        //Connection.getInstance().upload(feet);
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
        //Logger.getInstance().writeLog("INFO", "Head.exe: " + head);
        //Connection.getInstance().upload(head);
    }

    @Override
    public Object clone() {
        ConcretePrototype cloneObj = new ConcretePrototype();
        cloneObj.setAtt1(this.att1);
        cloneObj.setAtt2(this.att2);
        return cloneObj;
    }

}
