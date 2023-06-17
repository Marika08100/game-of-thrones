package src.Combat;

import src.Combat.Type.RangedWeaponType;
import src.Weapon;

public class RangedWeapon extends Weapon {
    private RangedWeaponType type;
    private int ammunition;

    public RangedWeapon(String name, int damage, int range,RangedWeaponType type, int ammunition) {
        super(name, damage, range);
        this.type = type;
        this.ammunition = ammunition;

    }

    @Override
    public void attack() {
        System.out.println("Ranged attack with " + getName() + "! Damage: " + getDamage());
        ammunition--;
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
                ", name=" + name +
                ", damage=" + damage +
                ", range =" + range +
                '}';
    }
}
