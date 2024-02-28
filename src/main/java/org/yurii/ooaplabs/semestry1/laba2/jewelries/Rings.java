package org.yurii.ooaplabs.semestry1.laba2.jewelries;

public abstract class Rings extends Jewelry {
    public Rings(double weight, double difficultyFactor) {
        super(weight, difficultyFactor);
    }

    public Rings(double weight) {
        super(weight);
    }

    public String getTypeName() {
        return "Каблучки";
    }
    public int getCostOfProduction() {
        return 1250;
    }

}
