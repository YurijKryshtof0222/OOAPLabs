package org.yurii.ooaplabs.laba2.jewelries.implementations.gold;

import org.yurii.ooaplabs.laba2.jewelries.GoldJewelry;
import org.yurii.ooaplabs.laba2.jewelries.Necklace;
import org.yurii.ooaplabs.laba2.util.MaterialType;

public class GoldNecklace extends Necklace implements GoldJewelry {
    public GoldNecklace(double weight, double difficultyFactor) {
        super(weight, difficultyFactor);
    }

    public GoldNecklace(double weight) {
        super(weight);
    }

    @Override
    public MaterialType getMaterial() {
        return MaterialType.GOLD;
    }

    public GoldNecklace() {
        super(40);
    }
}
