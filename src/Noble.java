package src;

import java.util.HashSet;
import java.util.Set;

public class Noble extends Character implements Mortal {
    private final Set<House> houses = new HashSet<>();
    private int wealth;

    public Noble(String name, String birthPlace, Gender gender, Set<House> houses, int wealth) {
        super(name, birthPlace, gender);
        this.wealth = wealth;
    }

    public Set<House> getHouses() {
        return houses;
    }

    public void addHouse(House house) {
        houses.add(house);
    }

    public void removeHouse(House house) {
        houses.remove(house);
    }


    public int getWealth() {
        return wealth;
    }

    public void setWealth(int wealth) {
        this.wealth = wealth;
    }


    public String getHousesAsString() { // Cersei of house LANNISTER has 500000 gold dragons.
        String outHouses = "";
        for (House house : houses) {
            outHouses += house + ", ";
        }
        return outHouses.substring(0, outHouses.length() - 1);

    }

    @Override
    public String toString() {
        return "Name= " + getName() + "of houses "
                + getHousesAsString() + " has" + getWealth() + " gold dragons.";
    }


    @Override
    public void die() {
        for (House house : houses) {
            System.out.println(house.getEnglishName());
        }
        super.die();
    }
}
