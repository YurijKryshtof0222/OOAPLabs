package org.yurii.ooaplabs.laba2.jewelries.implementations.gold;

import org.yurii.ooaplabs.laba2.jewelries.Bracelet;
import org.yurii.ooaplabs.laba2.jewelries.GoldJewelry;

public class GoldBracelet extends GoldJewelry implements Bracelet {
    public GoldBracelet(double weight, double difficultyFactor) {
        super(weight, difficultyFactor);
    }

    public GoldBracelet(double weight) {
        super(weight);
    }

    public GoldBracelet() {
        super(20);
    }
}