package src;

import java.util.HashSet;
import java.util.Set;

public class GameOfThrones {
    public static void main(String[] args) {
        Character character = new Character("Cercei", "Lannisport ");
        Character character1 = new Character("Cercei", "Lannisport ");
        Noble noble = new Noble("Cercei", "Lannisport", Set.of(House.GREYJOY,House.BARATHEON), 5000);
        House house = House.LANNISTER;
        System.out.println(noble.toString());
        System.out.println(Character.getWorldPopulation());

    }
}
