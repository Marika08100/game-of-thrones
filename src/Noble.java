package src;

import java.util.Set;

public class Noble extends Character implements Mortal {
    private Set<House> houses;
    private int wealth;

    public Noble(String name, String birthPlace, Set<House> houses, int wealth) {
        super(name, birthPlace);
        this.houses = houses;
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


    @Override
    public String toString() { // Cersei of house LANNISTER has 500000 gold dragons.
        return getName() + " of houses " + houses + " has " + wealth + " gold dragons.";
    }

    @Override
    public void die() {
        for (House house : houses) {
            System.out.println(house.getEnglishName());
        }
        super.die();
    }
}
