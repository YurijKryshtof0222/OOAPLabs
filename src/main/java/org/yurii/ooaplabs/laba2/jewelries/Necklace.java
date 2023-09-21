package org.yurii.ooaplabs.laba2.jewelries;

public abstract class Necklace extends Jewelry {
    public Necklace(double weight, double difficultyFactor) {
        super(weight, difficultyFactor);
    }

    public Necklace(double weight) {
        super(weight);
    }

    public String getTypeName() {
        return "Намисто";
    }
    public int getCostOfProduction() {
        return 1300;
    }
}
