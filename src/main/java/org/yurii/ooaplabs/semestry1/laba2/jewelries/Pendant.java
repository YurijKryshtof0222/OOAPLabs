package org.yurii.ooaplabs.semestry1.laba2.jewelries;

public abstract class Pendant extends Jewelry {

    public Pendant(double weight, double difficultyFactor) {
        super(weight, difficultyFactor);
    }

    public Pendant(double weight) {
        super(weight);
    }

    public String getTypeName() {
        return "Кулон";
    }
    public int getCostOfProduction() {
        return 1000;
    }
}