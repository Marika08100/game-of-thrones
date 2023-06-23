package src;

import src.Combat.MeleeWeapon;

import java.util.ArrayList;
import java.util.List;

public class Character implements Mortal {
    private String name;
    private final String birthPlace;
    private Gender gender;
    private static int worldPopulation = 0;
    private List<Weapon> weapons;


    public Character(String name, String birthPlace, Gender gender) {
        worldPopulation++;
        this.name = name;
        this.birthPlace = birthPlace;
        this.gender = gender;
        this.weapons = new ArrayList<>();


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

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
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

    public List<Weapon> getWeapons() {
        return weapons;
    }
    @Override
    public String toString() {
        return weapons.toString();
    }


}

