package game;

import game.characters.Boss;
import game.characters.Hero;

public class Main {
    public static void main(String[] args) {
        Boss newBoss = new Boss();
        newBoss.setHealth(500);
        newBoss.setDamage(100);
        newBoss.setProtectionType("physical");
        newBoss.printBossInfo();

        Hero[] heroes = createHeroes();

        for (int i = 0; i < heroes.length; i++) {
            heroes[i].printHeroInfo();

        }
    }

    public static Hero[] createHeroes(){
        Hero Orc = new Hero("Kiz Strongdrum", 200, 20, "Physical");
        Hero Elf = new Hero("Nyth'dir Silverthorn", 150, 40, "Magic");
        Hero Paladin = new Hero("Armulfuggs Caskore", 300, 40);
        return new Hero[]{Orc, Elf, Paladin};
    }
}
