package src;

import src.Combat.MeleeWeapon;
import src.Combat.RangedWeapon;
import src.Combat.Type.MeleeWeaponType;
import src.Combat.Type.RangedWeaponType;

import java.util.HashSet;
import java.util.Set;

public class GameOfThrones {
    public static void main(String[] args) {
        Character arya = new Noble("Arya", "Winterfell", Set.of(House.STARK),500);
        System.out.println(arya.hasWeapons()); // False

       // arya.addWeapon(new MeleeWeapon("Valyrian steel dagger", 20,20, MeleeWeaponType.DAGGER));
        arya.addWeapon(new RangedWeapon("Stolen bow", 10, 40, RangedWeaponType.BOW,20));

        arya.removeWeapon("Stolen bow");

        System.out.println(arya.getWeapons()); // [MeleeWeapon{type=DAGGER, name='Valyrian steel dagger', damage=20, range=1}]
    }
}