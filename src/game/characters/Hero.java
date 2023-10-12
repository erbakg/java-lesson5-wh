package game.characters;

public class Hero {
    private String name;
    private int health;
    private int damage;
    private String power;

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getPower() {
        return power;
    }

    public Hero(String name, int health, int damage, String power) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.power = power;

    }

    public Hero(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void printHeroInfo() {
        System.out.println("Hero name: " + this.name + "\n" + "Health: " + this.health + " Damage: " + this.damage + " Power: " + this.power);
    }
}
