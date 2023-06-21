package src.Combat;

import src.Combat.Type.MeleeWeaponType;
import src.Weapon;

public class MeleeWeapon extends Weapon {
    private MeleeWeaponType type;

    public MeleeWeapon(String name, int damage, int range, MeleeWeaponType type) {
        super(name, damage, 1);
        this.type = type;

    }

    public MeleeWeaponType getType() {
        return type;
    }

    @Override
    public void attack() {
        System.out.println("Melee attack with " + getName() + "! Damage: " + getDamage());


    }

    @Override
    public  String toString() {
        return "MeleeWeapon{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", damage=" + damage +
                ", range=" + range +
                '}';
    }
}
