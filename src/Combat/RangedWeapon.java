package src.Combat;

import src.Combat.Type.RangedWeaponType;
import src.character.Character;

public class RangedWeapon extends Weapon {
    private RangedWeaponType type;
    private int ammunition;

    public RangedWeapon(String name, int damage, int range, int ammunition, RangedWeaponType type) {
        super(name, damage, range);
        this.range = range;
        this.type = type;
        this.ammunition = ammunition;
    }

    public void attack() {
        System.out.println("Ranged attack with " + getName() + "! Damage: " + getDamage());
        ammunition--;
    }

    @Override
    public void attack(Character attacker, Character target) {
        int damage = this.getDamage();
        target.takeDamage(damage);
        System.out.println(attacker.getName() + " attacked " + target.getName() + " with a ranged weapon (" + this.getName() + ") and dealt " + damage + " damage.");
        ammunition--;
    }

    @Override
    public boolean isRanged() {
        return true;
    }

    public int getAmmunition() {
        return ammunition;
    }

    public void setAmmunition(int ammunition) {
        this.ammunition = ammunition;
    }

    @Override
    public String toString() {
        return "RangedWeapon{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", damage=" + damage +
                ", range=" + range +
                ", ammunition=" + ammunition +
                '}';
    }

    @Override
    protected int calculateMeleeDamage(Character attacker) {
        return 0;
    }

    @Override
    protected int calculateRangedDamage(Character attacker) {
        return 0;
    }
}
