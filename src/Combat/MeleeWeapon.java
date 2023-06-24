package src.Combat;

import src.Combat.Type.MeleeWeaponType;
import src.character.Character;

public class MeleeWeapon extends Weapon {
    private MeleeWeaponType type;

    public MeleeWeapon(String name, int damage, int range, MeleeWeaponType type) {
        super(name, damage, range);
        this.range = range;
        this.type = type;
    }

    @Override
    public void attack(Character attacker, Character target) {
        int damage = this.getDamage();
        target.takeDamage(damage);
        System.out.println(attacker.getName() + " attacked " + target.getName() + " with a melee weapon (" + this.getName() + ") and dealt " + damage + " damage.");
    }

    @Override
    public boolean isRanged() {
        return false;
    }

    @Override
    public String toString() {
        return "MeleeWeapon{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", damage=" + damage +
                ", range=" + range +
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
