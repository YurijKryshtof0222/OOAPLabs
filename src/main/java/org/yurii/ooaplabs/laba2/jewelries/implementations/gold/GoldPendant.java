package org.yurii.ooaplabs.laba2.jewelries.implementations.gold;

import org.yurii.ooaplabs.laba2.jewelries.GoldJewelry;
import org.yurii.ooaplabs.laba2.jewelries.Pendant;
import org.yurii.ooaplabs.laba2.util.MaterialType;

public class GoldPendant extends Pendant implements GoldJewelry {
    public GoldPendant(double weight, double difficultyFactor) {
        super(weight, difficultyFactor);
    }

    public GoldPendant(double weight) {
        super(weight);
    }

    @Override
    public MaterialType getMaterial() {
        return MaterialType.GOLD;
    }

    public GoldPendant() {
        super(20);
    }
}
