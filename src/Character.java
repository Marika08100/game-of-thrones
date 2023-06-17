package src;

public class Character implements Mortal {
    private String name;
    private final String birthPlace;
    private Gender gender;
    private static int worldPopulation = 0;

    public Character(String name, String birthPlace) {
        this.name = name;
        this.birthPlace = birthPlace;
        increasePopulation();



    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthPlace() {
        return this.birthPlace;
    }

    public Gender getGENDER() {
        return this.gender;
    }

    public void setGENDER(Gender gender) {
        if (this.gender == Gender.MALE && gender == Gender.EUNUCH) {
            this.gender = gender;
        } else {
            System.out.println("Only MALE characters can be transformed into EUNUCH.");
        }
    }

    public static int getWorldPopulation() {
        return worldPopulation;

    }
    private static void increasePopulation() {
        worldPopulation++;
    }
    public static void decreasePopulation(){
         worldPopulation--;
    }

    @Override
    public void die() {
        decreasePopulation();
    }
}

