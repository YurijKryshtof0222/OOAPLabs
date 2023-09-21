package org.yurii.ooaplabs.laba2.jewelries;

import org.yurii.ooaplabs.laba2.util.MaterialType;

public interface SilverJewelry {
    default MaterialType getMaterial() {
        return MaterialType.SILVER;
    }
}
