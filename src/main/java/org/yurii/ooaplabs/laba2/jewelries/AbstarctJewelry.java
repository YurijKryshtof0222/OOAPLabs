package org.yurii.ooaplabs.laba2.jewelries;

import org.yurii.ooaplabs.laba2.util.MaterialType;

public abstract class AbstarctJewelry {
    private final double weight;
    private final double difficultyFactor;

    public AbstarctJewelry(double weight, double difficultyFactor) {
        this.weight = weight;
        this.difficultyFactor = difficultyFactor;
    }

    public AbstarctJewelry(double weight) {
        this.weight = weight;
        this.difficultyFactor = 1.0;
    }

    public abstract String getTypeName();
    public abstract MaterialType getMaterial();
    public abstract int getCostOfProduction();

    public double getWeight() {
        return weight;
    }

    public double getDifficultyFactor() {
        return difficultyFactor;
    }
    public final int getPrice() {
        return (int)(getCostOfProduction()
                * getMaterial().getPriceCoefficient()
                * getDifficultyFactor()
                * (1 + (getWeight() / 1000)));
    }
    public final String getMaterialName() {
        return getMaterial().getMaterialName();
    }
}
