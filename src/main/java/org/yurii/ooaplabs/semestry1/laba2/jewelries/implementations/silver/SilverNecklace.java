package org.yurii.ooaplabs.semestry1.laba2.jewelries.implementations.silver;

import org.yurii.ooaplabs.semestry1.laba2.jewelries.Necklace;
import org.yurii.ooaplabs.semestry1.laba2.util.MaterialType;

public class SilverNecklace extends Necklace {
    public SilverNecklace(double weight, double difficultyFactor) {
        super(weight, difficultyFactor);
    }

    public SilverNecklace(double weight) {
        super(weight);
    }

    public SilverNecklace() {
        super(40);
    }

    @Override
    public MaterialType getMaterial() {
        return MaterialType.SILVER;
    }
}
