package src;

import java.util.HashSet;
import java.util.Set;

public class Noble extends Character implements Mortal {
    private Set<House> houses = new HashSet<>();
    private int wealth;

    public Noble(String name, String birthPlace, Gender gender, Set<House> houses, int wealth) {
        super(name, birthPlace, gender);
        this.wealth = wealth;
        this.houses = new HashSet<>(houses);

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

    public void setHouses(Set<House> houses) {
        this.houses = new HashSet<>(houses);
    }


    public int getWealth() {
        return wealth;
    }

    public void setWealth(int wealth) {
        this.wealth = wealth;
    }

    @Override
    public String toString() {
        return "Name=" + getName() + " of houses "
                + getHousesAsString() + " has " +
                getWealth() + " gold dragons.";
    }

    public String getHousesAsString() {
        if (houses.isEmpty()) {
            return "";
        }

        StringBuilder outHouses = new StringBuilder();
        for (House house : houses) {
            outHouses.append(house).append(", ");
        }
        outHouses.delete(outHouses.length() - 2, outHouses.length());

        return outHouses.toString();
    }



    @Override
    public void die() {
        for (House house : houses) {
            System.out.println(house.getEnglishName());
        }
        super.die();
    }
}
