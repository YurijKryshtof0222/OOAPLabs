package org.yurii.ooaplabs.laba2.jewelries.implementations.silver;

import org.yurii.ooaplabs.laba2.jewelries.Bracelet;
import org.yurii.ooaplabs.laba2.jewelries.SilverJewelry;
import org.yurii.ooaplabs.laba2.util.MaterialType;

public class SilverBracelet extends Bracelet implements SilverJewelry {
    public SilverBracelet(double weight, double difficultyFactor) {
        super(weight, difficultyFactor);
    }

    public SilverBracelet(double weight) {
        super(weight);
    }

    @Override
    public MaterialType getMaterial() {
        return MaterialType.SILVER;
    }

    public SilverBracelet() {
        super(20);
    }
}
