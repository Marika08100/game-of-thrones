package src;

import src.Combat.MeleeWeapon;
import src.character.Mortal;
import src.character.type.Gender;

public class Character implements Mortal {
    private String name;
    private final String birthPlace;
    private Gender gender;
    private static int worldPopulation = 0;

    public Character(String name, String birthPlace, Gender gender) {
        worldPopulation++;
        this.name = name;
        this.birthPlace = birthPlace;
        this.gender = gender;

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
        return false;
    }

    public void addWeapon(MeleeWeapon valyrianSteelDagger) {

    }

    public void removeWeapon(String stolenBow) {
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

    public String getWeapons() {
        return toString();
    }

}

