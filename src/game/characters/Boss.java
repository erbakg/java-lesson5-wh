package game.characters;

public class Boss {
private String name = "Boss";
private int damage;

    private int health;
private String protectionType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getProtectionType() {
        return protectionType;
    }

    public void setProtectionType(String protectionType) {
        this.protectionType = protectionType;
    }

    public void printBossInfo() {
        System.out.println("Hero name: " + this.name + "\n" + "Health: " + this.health + " Damage: " + this.damage + " Protection type: " + this.protectionType);
    }
}
