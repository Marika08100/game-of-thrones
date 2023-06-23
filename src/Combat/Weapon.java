package src.Combat;

import src.character.GameCharacter;
import src.character.FightType;

public abstract class Weapon {
    protected String name;
    protected int damage;
    protected int range;

    public Weapon(String name, int damage, int range) {
        this.name = name;
        this.damage = damage;
        this.range = range;
    }

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

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public abstract void attack(GameCharacter attacker, GameCharacter target);

    public abstract boolean isRanged();

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", range=" + range +
                '}';
    }

    public void attack(GameCharacter attacker, GameCharacter target, FightType fightType) {
        String fightTypeName = fightType == FightType.MELEE ? "melee" : "ranged";
        System.out.println(attacker.getName() + " engages in " + fightTypeName + " combat with " + target.getName() + ".");

        if (fightType == FightType.MELEE) {
            int damage = calculateMeleeDamage(attacker); // Számítsd ki a melee támadás sebzését
            target.takeDamage(damage); // Ellenfél sebződik a kapott sebzés mértékével
        } else if (fightType == FightType.RANGED) {
            int damage = calculateRangedDamage(attacker); // Számítsd ki a ranged támadás sebzését
            target.takeDamage(damage); // Ellenfél sebződik a kapott sebzés mértékével
        }
    }

    protected abstract int calculateMeleeDamage(GameCharacter attacker);

    protected abstract int calculateRangedDamage(GameCharacter attacker);
}
