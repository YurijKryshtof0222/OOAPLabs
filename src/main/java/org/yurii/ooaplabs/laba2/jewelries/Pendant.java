package org.yurii.ooaplabs.laba2.jewelries;

public abstract class Pendant extends AbstarctJewelry {

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