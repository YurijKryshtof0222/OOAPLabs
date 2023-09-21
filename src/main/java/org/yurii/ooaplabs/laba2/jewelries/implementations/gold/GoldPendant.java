package org.yurii.ooaplabs.laba2.jewelries.implementations.gold;

import org.yurii.ooaplabs.laba2.jewelries.GoldJewelry;
import org.yurii.ooaplabs.laba2.jewelries.Pendant;

public class GoldPendant extends GoldJewelry implements Pendant {
    public GoldPendant(double weight, double difficultyFactor) {
        super(weight, difficultyFactor);
    }

    public GoldPendant(double weight) {
        super(weight);
    }

    public GoldPendant() {
        super(20);
    }
}
