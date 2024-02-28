package org.yurii.ooaplabs.semestry1.laba2.jewelries;

public abstract class Earrings extends Jewelry {
    public Earrings(double weight, double difficultyFactor) {
        super(weight, difficultyFactor);
    }

    public Earrings(double weight) {
        super(weight);
    }

    public String getTypeName() {
        return "Сережки";
    }
    public int getCostOfProduction() {
        return 600;
    }
}
