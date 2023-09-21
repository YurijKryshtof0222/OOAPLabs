package org.yurii.ooaplabs.laba2.jewelries.implementations.gold;

import org.yurii.ooaplabs.laba2.jewelries.Rings;
import org.yurii.ooaplabs.laba2.util.MaterialType;

public class GoldRings extends Rings  {
    public GoldRings(double weight, double difficultyFactor) {
        super(weight, difficultyFactor);
    }

    public GoldRings(double weight) {
        super(weight);
    }

    public GoldRings() {
        super(60);
    }

    @Override
    public MaterialType getMaterial() {
        return MaterialType.GOLD;
    }
}
