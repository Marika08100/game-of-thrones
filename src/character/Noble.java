package src.character;

import src.character.type.Gender;
import src.character.type.House;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Noble extends GameCharacter implements Mortal {
    private Set<House> houses = new HashSet<>();
    private final Map<String, Integer> coins = new HashMap<>();

    public Noble(String name, String birthPlace, Gender gender, Set<House> houses) {
        super(name, birthPlace, gender);
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


    public void addCoins(String coinType, int amount) {
        coins.put(coinType, coins.getOrDefault(coinType, 0) + amount);
    }

    public void removeCoins(String coinType, int amount) {
        int currentAmount = coins.getOrDefault(coinType, 0);
        if (currentAmount >= amount) {
            coins.put(coinType, currentAmount - amount);
        } else {
            System.out.println("Not enough coins of type " + coinType);
        }
    }

    public int getWealth() {
            int totalWealth = 0;
            for (Map.Entry<String, Integer> entry : coins.entrySet()) {
                String coinType = entry.getKey();
                int amount = entry.getValue();

                switch (coinType) {
                    case "gold" -> totalWealth += amount * 100;
                    case "silver" -> totalWealth += amount * 10;
                    case "copper" -> totalWealth += amount;
                }
            }
            return totalWealth;
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
    @Override
    public String toString() {
        return "Name=" + getName() + " of house(s) "
                + getHousesAsString() + " has " +
                getWealth() + " wealth in copper.";
    }
}
