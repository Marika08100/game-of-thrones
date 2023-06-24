package src.character;

import src.character.type.Gender;
import src.Combat.Weapon;

import java.util.ArrayList;
import java.util.List;

public class Character implements Mortal {
    private String name;
    private final String birthPlace;
    private Gender gender;
    private static int worldPopulation = 0;
    private List<Weapon> weapons;
    int health;


    public Character(String name, String birthPlace, Gender gender) {
        worldPopulation++;
        this.name = name;
        this.birthPlace = birthPlace;
        this.gender = gender;
        this.weapons = new ArrayList<>();
        health = 100;
    }


    public void castration() {
        if (this.gender == Gender.MALE) {
            this.gender = Gender.EUNUCH;
        }
    }

    public static int getWorldPopulation() {
        return worldPopulation;
    }

    @Override
    public void die() {
        worldPopulation--;
    }

    public boolean hasWeapons() {
        return !weapons.isEmpty();
    }

    public void addWeapon(Weapon valyrianSteelDagger) {
        weapons.add(valyrianSteelDagger);
    }

    public void removeWeapon(String stolenBow) {
        weapons.remove(stolenBow);
    }

    private void initiateFight(Weapon weapon, Character enemy, FightType fightType) {
        String fightTypeName = fightType == FightType.MELEE ? "melee" : "ranged";
        System.out.println(this.getName() + " engages in " + fightTypeName + " combat with " + enemy.getName() + ".");
        weapon.attack(this, enemy);
    }

    public void fight(Character enemy, FightType fightType) {
        if (this.hasWeapons()) {
            for (Weapon weapon : this.getWeapons()) {
                if ((fightType == FightType.MELEE && !weapon.isRanged()) ||
                        (fightType == FightType.RANGED && weapon.isRanged())) {
                    initiateFight(weapon, enemy, fightType);
                }
            }
        } else {
            System.out.println(this.getName() + " has no weapons to fight with.");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getBirthPlace() {
        return this.birthPlace;
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setGender(Gender gender) {
        if (this.gender == Gender.MALE && gender == Gender.EUNUCH) {
            this.gender = gender;
        } else {
            System.out.println("Only MALE characters can be transformed into EUNUCH.");
        }
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(this.getName() + "'s health dropped to " + health + "/100.");
    }

    public int calculateMeleeDamage() {
        int totalDamage = 0;
        for (Weapon weapon : weapons) {
            if (!weapon.isRanged()) {
                totalDamage += weapon.getDamage();
            }
        }
        return totalDamage;
    }

    public List<Weapon> getWeapons() {
        return weapons;
    }

}
