package org.yurii.ooaplabs.semestry1.laba2.jewelries.implementations.silver;

import org.yurii.ooaplabs.semestry1.laba2.jewelries.Pendant;
import org.yurii.ooaplabs.semestry1.laba2.util.MaterialType;

public class SilverPendant extends Pendant {
    public SilverPendant(double weight, double difficultyFactor) {
        super(weight, difficultyFactor);
    }

    public SilverPendant(double weight) {
        super(weight);
    }

    public SilverPendant() {
        super(20);
    }

    @Override
    public MaterialType getMaterial() {
        return MaterialType.SILVER;
    }
}
