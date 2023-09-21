package org.yurii.ooaplabs.laba2.jewelries;

import org.yurii.ooaplabs.laba2.jewelries.Jewelry;
import org.yurii.ooaplabs.laba2.util.MaterialType;

public abstract class GoldJewelry extends Jewelry {
    public GoldJewelry(double weight, double difficultyFactor) {
        super(weight, difficultyFactor);
    }

    public GoldJewelry(double weight) {
        super(weight);
    }

    @Override
    public MaterialType getMaterial() {
        return MaterialType.GOLD;
    }
}
