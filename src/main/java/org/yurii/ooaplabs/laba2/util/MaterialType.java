package org.yurii.ooaplabs.laba2.util;

public enum MaterialType {
    GOLD(1.4, "Золото"),
    SILVER(1.2, "Срібло");


    private final double priceCoefficient;
    private final String materialName;

    MaterialType(double priceCoefficient, String typeInfo) {
        this.priceCoefficient = priceCoefficient;
        this.materialName = typeInfo;
    }

    public double getPriceCoefficient() {
        return priceCoefficient;
    }

    public String getMaterialName() {
        return materialName;
    }
}
