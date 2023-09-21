package org.yurii.ooaplabs.laba2.jewelries.implementations.silver;

import org.yurii.ooaplabs.laba2.jewelries.Rings;
import org.yurii.ooaplabs.laba2.jewelries.SliverJewelry;

public class SilverRings extends SliverJewelry implements Rings {
    public SilverRings(double weight, double difficultyFactor) {
        super(weight, difficultyFactor);
    }

    public SilverRings(double weight) {
        super(weight);
    }

    public SilverRings() {
        super(60);
    }
}
