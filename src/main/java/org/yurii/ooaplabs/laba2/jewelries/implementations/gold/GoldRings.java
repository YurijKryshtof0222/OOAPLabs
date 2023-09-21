package org.yurii.ooaplabs.laba2.jewelries.implementations.gold;

import org.yurii.ooaplabs.laba2.jewelries.GoldJewelry;
import org.yurii.ooaplabs.laba2.jewelries.Rings;

public class GoldRings extends GoldJewelry implements Rings {
    public GoldRings(double weight, double difficultyFactor) {
        super(weight, difficultyFactor);
    }

    public GoldRings(double weight) {
        super(weight);
    }

    public GoldRings() {
        super(60);
    }
}
