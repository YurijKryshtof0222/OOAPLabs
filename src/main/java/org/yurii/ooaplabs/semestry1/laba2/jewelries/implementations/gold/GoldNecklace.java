package org.yurii.ooaplabs.semestry1.laba2.jewelries.implementations.gold;

import org.yurii.ooaplabs.semestry1.laba2.jewelries.Necklace;
import org.yurii.ooaplabs.semestry1.laba2.util.MaterialType;

public class GoldNecklace extends Necklace {
    public GoldNecklace(double weight, double difficultyFactor) {
        super(weight, difficultyFactor);
    }

    public GoldNecklace(double weight) {
        super(weight);
    }

    public GoldNecklace() {
        super(40);
    }

    @Override
    public MaterialType getMaterial() {
        return MaterialType.GOLD;
    }
}
