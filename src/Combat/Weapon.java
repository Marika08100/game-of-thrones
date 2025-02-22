package src.Combat;

import src.character.Character;
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

    public abstract void attack(Character attacker, Character target);

    public abstract boolean isRanged();

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", range=" + range +
                '}';
    }

    public void attack(Character attacker, Character target, FightType fightType) {
        String fightTypeName = fightType == FightType.MELEE ? "melee" : "ranged";
        System.out.println(attacker.getName() + " engages in " + fightTypeName + " combat with " + target.getName() + ".");

        if (fightType == FightType.MELEE) {
            int damage = calculateMeleeDamage(attacker); 
            target.takeDamage(damage); /l
        } else if (fightType == FightType.RANGED) {
            int damage = calculateRangedDamage(attacker); 
            target.takeDamage(damage); 
        }
    }

    protected abstract int calculateMeleeDamage(Character attacker);

    protected abstract int calculateRangedDamage(Character attacker);
}
