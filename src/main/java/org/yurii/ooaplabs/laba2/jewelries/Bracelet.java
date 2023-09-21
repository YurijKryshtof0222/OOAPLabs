package org.yurii.ooaplabs.laba2.jewelries;

public abstract class Bracelet extends Jewelry {
    public Bracelet(double weight, double difficultyFactor) {
        super(weight, difficultyFactor);
    }

    public Bracelet(double weight) {
        super(weight);
    }

    public String getTypeName() {
        return "Браслет";
    }
    public int getCostOfProduction() {
        return 800;
    }
}
