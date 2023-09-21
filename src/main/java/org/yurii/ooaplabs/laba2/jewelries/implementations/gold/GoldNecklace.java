package org.yurii.ooaplabs.laba2.jewelries.implementations.gold;

import org.yurii.ooaplabs.laba2.jewelries.GoldJewelry;
import org.yurii.ooaplabs.laba2.jewelries.Necklace;

public class GoldNecklace extends GoldJewelry implements Necklace {
    public GoldNecklace(double weight, double difficultyFactor) {
        super(weight, difficultyFactor);
    }

    public GoldNecklace(double weight) {
        super(weight);
    }

    public GoldNecklace() {
        super(40);
    }
}
