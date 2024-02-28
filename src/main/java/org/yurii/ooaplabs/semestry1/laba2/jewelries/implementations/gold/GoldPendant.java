package org.yurii.ooaplabs.semestry1.laba2.jewelries.implementations.gold;

import org.yurii.ooaplabs.semestry1.laba2.jewelries.Pendant;
import org.yurii.ooaplabs.semestry1.laba2.util.MaterialType;

public class GoldPendant extends Pendant  {
    public GoldPendant(double weight, double difficultyFactor) {
        super(weight, difficultyFactor);
    }

    public GoldPendant(double weight) {
        super(weight);
    }

    public GoldPendant() {
        super(20);
    }

    @Override
    public MaterialType getMaterial() {
        return MaterialType.GOLD;
    }
}
