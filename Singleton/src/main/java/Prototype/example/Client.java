package Prototype.example;

public class Client {
    public static void main(String []args){
        Character first = new Character();
        first.setArmor(100);
        first.setWeapon("Bane of Existance");
        first.setDmg(100);
        first.setLvl(1);
        first.setSpeed(50);
        Character second = (Character) first.clone();
        Character third = (Character) first.clone();
        Character fourth = (Character) first.clone();
        Character fifth = (Character) first.clone();


        second.setWeapon("Stick");
        third.setSpeed(1000);
        fourth.setDmg(9999);
        fifth.setArmor(10);

        first.getStats();
        second.getStats();
        third.getStats();
        fourth.getStats();
        fifth.getStats();

    }
}
