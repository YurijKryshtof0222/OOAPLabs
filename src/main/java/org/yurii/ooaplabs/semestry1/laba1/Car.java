package org.yurii.ooaplabs.semestry1.laba1;

public final class Car {
    private String brandName;
    private String modelName;

    public String getBrandName() {
        return brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public Car(String brandName, String modelName) {
        this.brandName = brandName;
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandName='" + brandName + '\'' +
                ", modelName='" + modelName + '\'' +
                '}';
    }
}
