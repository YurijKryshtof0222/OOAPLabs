package org.yurii.ooaplabs.semestry2.laba9Var10;

//Originator
public class BrakeSystem {
    private String brakeComponents;
    private boolean isFixed;

    public BrakeSystem(String brakeComponents) {
        this.brakeComponents = brakeComponents;
    }

    public BrakeSystemMemento save() {
        return new BrakeSystemMemento(brakeComponents, isFixed);
    }

    public void restore(BrakeSystemMemento brakeSystemMemento) {
        this.brakeComponents = brakeSystemMemento.getBrakeComponents();
        this.isFixed = brakeSystemMemento.isFixed();
    }

    public void fix() {
        isFixed = true;
    }

    public boolean isFixed() {
        return isFixed;
    }


    public String getBrakeComponents() {
        return brakeComponents;
    }

    @Override
    public String toString() {
        return brakeComponents + ", isFixed= " + isFixed;
    }
}
