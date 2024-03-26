package org.yurii.ooaplabs.semestry2.laba9Var10;

public class BrakeSystemMemento {
    private String brakeComponents;
    private boolean isFixed;

    public BrakeSystemMemento(String brakeComponents, boolean isFixed) {
        this.brakeComponents = brakeComponents;
        this.isFixed = isFixed;
    }

    public String getBrakeComponents() {
        return brakeComponents;
    }

    public boolean isFixed() {
        return isFixed;
    }

    @Override
    public String toString() {
        return brakeComponents + ", isFixed= " + isFixed;
    }
}