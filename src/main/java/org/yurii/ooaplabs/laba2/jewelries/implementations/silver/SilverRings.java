package org.yurii.ooaplabs.laba2.jewelries.implementations.silver;

import org.yurii.ooaplabs.laba2.jewelries.Rings;
import org.yurii.ooaplabs.laba2.jewelries.SilverJewelry;
import org.yurii.ooaplabs.laba2.util.MaterialType;

public class SilverRings extends Rings implements SilverJewelry {
    public SilverRings(double weight, double difficultyFactor) {
        super(weight, difficultyFactor);
    }

    public SilverRings(double weight) {
        super(weight);
    }

    @Override
    public MaterialType getMaterial() {
        return MaterialType.SILVER;
    }

    public SilverRings() {
        super(60);
    }
}
