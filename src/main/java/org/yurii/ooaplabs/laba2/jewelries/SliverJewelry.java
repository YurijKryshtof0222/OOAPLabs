package org.yurii.ooaplabs.laba2.jewelries;

import org.yurii.ooaplabs.laba2.jewelries.Jewelry;
import org.yurii.ooaplabs.laba2.util.MaterialType;

public abstract class SliverJewelry extends Jewelry {
    public SliverJewelry(double weight, double difficultyFactor) {
        super(weight, difficultyFactor);
    }

    public SliverJewelry(double weight) {
        super(weight);
    }

    @Override
    public MaterialType getMaterial() {
        return MaterialType.SILVER;
    }
}
