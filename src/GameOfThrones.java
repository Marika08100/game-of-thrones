package src;

import src.Combat.MeleeWeapon;
import src.Combat.Type.MeleeWeaponType;

import java.util.Set;

public class GameOfThrones {
    public static void main(String[] args) {
        Character arya = new Noble("Arya", "Winterfell", Gender.FEMALE, Set.of(House.STARK), 30);
        Noble noble = new Noble("Cercei", "Winterfall",Gender.MALE,Set.of(House.LANNISTER),30);
        System.out.println(noble);
        System.out.println(arya.hasWeapons()); // False

        arya.addWeapon(new MeleeWeapon("Valyrian steel dagger", 20,20, MeleeWeaponType.DAGGER));
        //arya.addWeapon(new RangedWeapon("Stolen bow", 10, 40, RangedWeaponType.BOW,20));

        arya.removeWeapon("Stolen bow");

        System.out.println(arya.hasWeapons()); // False
        System.out.println(arya.getWeapons()); // [MeleeWeapon{type=DAGGER, name='Valyrian steel dagger', damage=20, range=1}]
    }
}