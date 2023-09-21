package org.yurii.ooaplabs.laba2.jewelries.implementations.gold;

import org.yurii.ooaplabs.laba2.jewelries.GoldJewelry;
import org.yurii.ooaplabs.laba2.jewelries.Rings;
import org.yurii.ooaplabs.laba2.util.MaterialType;

public class GoldRings extends Rings implements GoldJewelry {
    public GoldRings(double weight, double difficultyFactor) {
        super(weight, difficultyFactor);
    }

    public GoldRings(double weight) {
        super(weight);
    }

    @Override
    public MaterialType getMaterial() {
        return MaterialType.GOLD;
    }

    public GoldRings() {
        super(60);
    }
}
