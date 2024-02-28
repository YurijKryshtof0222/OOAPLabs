package org.yurii.ooaplabs.semestry1.laba2.jewelryFactories;

import org.yurii.ooaplabs.semestry1.laba2.jewelries.*;
import org.yurii.ooaplabs.semestry1.laba2.jewelries.implementations.silver.*;

// Реалізація фабрики для срібних виробів
public class SilverJewelryFactory implements JewelryFactory {
    @Override
    public Earrings createEarrings() {
        return new SilverEarrings();
    }

    @Override
    public Rings createRing() {
        return new SilverRings();
    }

    @Override
    public Necklace createNecklace() {
        return new SilverNecklace();
    }

    @Override
    public Pendant createPendant() {
        return new SilverPendant();
    }

    @Override
    public Bracelet createBracelet() {
        return new SilverBracelet();
    }
}
