package org.yurii.ooaplabs.laba2.jewelries.implementations.silver;

import org.yurii.ooaplabs.laba2.jewelries.Pendant;
import org.yurii.ooaplabs.laba2.jewelries.SilverJewelry;
import org.yurii.ooaplabs.laba2.util.MaterialType;

public class SilverPendant extends Pendant implements SilverJewelry {
    public SilverPendant(double weight, double difficultyFactor) {
        super(weight, difficultyFactor);
    }

    public SilverPendant(double weight) {
        super(weight);
    }

    @Override
    public MaterialType getMaterial() {
        return MaterialType.SILVER;
    }

    public SilverPendant() {
        super(20);
    }
}
