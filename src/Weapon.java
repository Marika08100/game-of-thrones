package src;

import java.util.List;

public abstract class Weapon {
    protected String name;
    protected int damage;
    protected int range;

    public Weapon(String name, int damage, int range){
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
    public abstract void attack();

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", range=" + range +
                '}';
    }
}
