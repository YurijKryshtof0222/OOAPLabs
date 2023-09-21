package org.yurii.ooaplabs.laba2.jewelries.implementations.gold;

import org.yurii.ooaplabs.laba2.jewelries.Earrings;
import org.yurii.ooaplabs.laba2.jewelries.GoldJewelry;

public class GoldEarrings extends GoldJewelry implements Earrings {
    public GoldEarrings(double weight, double difficultyFactor) {
        super(weight, difficultyFactor);
    }

    public GoldEarrings(double weight) {
        super(weight);
    }

    public GoldEarrings() {
        super(10);
    }
}
