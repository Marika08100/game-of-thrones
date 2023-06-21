package src;

public enum House {
    STARK("Winter is Coming", "Közeleg a tél", "wolf"),

    LANNISTER("Hear Me Roar ", "Halld üvöltésem ", "lion"),


    TARGARYEN("Fire and Blood ", "Tűz és vér ", "dragon"),

    BARATHEON("Ours is the Fury ", "Miénk a harag ", "stag"),

    GREYJOY("We Do Not Sow ", "Mi nem vetünk ", "kraken"),

    TYRELL("Growing Strong ", "Erőssé növünk ", "rose");
    private final String englishName;
    private final String hungarianName;
    private final String sigil;

    House(String englishNme, String hungarianName, String sigil) {
        this.englishName = englishNme;
        this.hungarianName = hungarianName;
        this.sigil = sigil;

    }

    public String getEnglishName() {
        return englishName;
    }

    public String getHungarianName() {
        return this.hungarianName;
    }

    public String getSigil() {
        return this.sigil;
    }


    @Override
    public String toString() {
        return "House{=" + this.name() +
                " englishName='" + englishName + '\'' +
                ", hungarianName='" + hungarianName + '\'' +
                ", sigil='" + sigil + '\'' +
                '}';
    }


}
