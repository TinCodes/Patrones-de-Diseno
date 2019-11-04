package Prototype.example;

public class Character implements Prototype {
    private int armor;
    private String weapon;
    private int dmg;
    private int lvl;
    private int speed;

    public Character(){

    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void getStats(){
        System.out.println("Armor: " + getArmor());
        System.out.println("Weapon: " + getWeapon());
        System.out.println("Damage: " + getDmg());
        System.out.println("Lvl: " + getLvl());
        System.out.println("Speed: " + getSpeed() + "\n");
    }

    @Override
    public Object clone() {
        Character newChar = new Character();
        newChar.setArmor(this.armor);
        newChar.setWeapon(this.weapon);
        newChar.setDmg(this.dmg);
        newChar.setLvl(this.lvl);
        newChar.setSpeed(this.speed);
        return newChar;
    }
}
