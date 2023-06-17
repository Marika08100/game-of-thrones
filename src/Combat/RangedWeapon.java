package src.Combat;

import src.Weapon;
public class RangedWeapon extends Weapon {
    private int ammunition;
    public RangedWeapon(String name, int damage, int range, int ammunition) {
        super(name, damage, range);
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
}
