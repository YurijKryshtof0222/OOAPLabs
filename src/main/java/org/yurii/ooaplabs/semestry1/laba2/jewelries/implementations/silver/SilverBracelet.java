package org.yurii.ooaplabs.semestry1.laba2.jewelries.implementations.silver;

import org.yurii.ooaplabs.semestry1.laba2.jewelries.Bracelet;
import org.yurii.ooaplabs.semestry1.laba2.util.MaterialType;

public class SilverBracelet extends Bracelet {
    public SilverBracelet(double weight, double difficultyFactor) {
        super(weight, difficultyFactor);
    }

    public SilverBracelet(double weight) {
        super(weight);
    }

    public SilverBracelet() {
        super(20);
    }

    @Override
    public MaterialType getMaterial() {
        return MaterialType.SILVER;
    }
}
