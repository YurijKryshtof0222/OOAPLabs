package org.yurii.ooaplabs.laba2.jewelries.implementations.silver;

import org.yurii.ooaplabs.laba2.jewelries.Necklace;
import org.yurii.ooaplabs.laba2.jewelries.SilverJewelry;
import org.yurii.ooaplabs.laba2.util.MaterialType;

public class SilverNecklace extends Necklace implements SilverJewelry {
    public SilverNecklace(double weight, double difficultyFactor) {
        super(weight, difficultyFactor);
    }

    public SilverNecklace(double weight) {
        super(weight);
    }

    @Override
    public MaterialType getMaterial() {
        return MaterialType.SILVER;
    }

    public SilverNecklace() {
        super(40);
    }
}
