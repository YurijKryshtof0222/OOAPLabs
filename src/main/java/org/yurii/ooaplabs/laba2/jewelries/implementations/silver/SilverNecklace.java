package org.yurii.ooaplabs.laba2.jewelries.implementations.silver;

import org.yurii.ooaplabs.laba2.jewelries.Necklace;
import org.yurii.ooaplabs.laba2.jewelries.SliverJewelry;

public class SilverNecklace extends SliverJewelry implements Necklace {
    public SilverNecklace(double weight, double difficultyFactor) {
        super(weight, difficultyFactor);
    }

    public SilverNecklace(double weight) {
        super(weight);
    }

    public SilverNecklace() {
        super(40);
    }
}
