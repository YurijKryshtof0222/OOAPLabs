package org.yurii.ooaplabs.laba2.jewelries.implementations.gold;

import org.yurii.ooaplabs.laba2.jewelries.Bracelet;
import org.yurii.ooaplabs.laba2.jewelries.GoldJewelry;
import org.yurii.ooaplabs.laba2.util.MaterialType;

public class GoldBracelet extends Bracelet implements GoldJewelry {
    public GoldBracelet(double weight, double difficultyFactor) {
        super(weight, difficultyFactor);
    }

    public GoldBracelet(double weight) {
        super(weight);
    }

    @Override
    public MaterialType getMaterial() {
        return MaterialType.GOLD;
    }

    public GoldBracelet() {
        super(20);
    }
}