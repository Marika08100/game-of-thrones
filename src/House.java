package src;

public enum House {
    STARK("Winter is Coming", "Közeleg a tél","wolf"),

    LANNISTER("Hear Me Roar ", "Halld üvöltésem ","lion"),


    TARGARYEN("Fire and Blood ", "Tűz és vér ","dragon"),

    BARATHEON("Ours is the Fury ", "Miénk a harag ","stag"),

    GREYJOY("We Do Not Sow ", "Mi nem vetünk ","kraken"),

    TYRELL("Growing Strong ", "Erőssé növünk ","rose");
    private String englishName;
    private String hungarianName;
    private String sigil;

    House(String englishNme, String hungarianName, String sigil) {
        this.englishName = englishNme;
        this.hungarianName = hungarianName;
        this.sigil = sigil;

    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String enghlishName) {
        this.englishName = enghlishName;
    }

    public String getHungarianName() {
        return hungarianName;
    }

    public void setHungarianName(String hungarianName) {
        this.hungarianName = hungarianName;
    }

    @Override
    public String toString() {
        return "House{" +
                "englishName='" + englishName + '\'' +
                ", hungarianName='" + hungarianName + '\'' +
                ", sigil='" + sigil + '\'' +
                '}';
    }
}
