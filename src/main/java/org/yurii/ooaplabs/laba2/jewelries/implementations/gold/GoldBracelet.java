package org.yurii.ooaplabs.laba2.jewelries.implementations.gold;

import org.yurii.ooaplabs.laba2.jewelries.Bracelet;
import org.yurii.ooaplabs.laba2.util.MaterialType;

public class GoldBracelet extends Bracelet {
    public GoldBracelet(double weight, double difficultyFactor) {
        super(weight, difficultyFactor);
    }

    public GoldBracelet(double weight) {
        super(weight);
    }

    public GoldBracelet() {
        super(20);
    }

    @Override
    public MaterialType getMaterial() {
        return MaterialType.GOLD;
    }
}