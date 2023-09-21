package org.yurii.ooaplabs.laba2.jewelries.implementations.silver;

import org.yurii.ooaplabs.laba2.jewelries.Earrings;
import org.yurii.ooaplabs.laba2.jewelries.SliverJewelry;

// Реалізація різних видів срібних виробів
public class SilverEarrings extends SliverJewelry implements Earrings {

    public SilverEarrings(double weight, double difficultyFactor) {
        super(weight, difficultyFactor);
    }

    public SilverEarrings(double weight) {
        super(weight);
    }

    public SilverEarrings() {
        super(10);
    }
}
