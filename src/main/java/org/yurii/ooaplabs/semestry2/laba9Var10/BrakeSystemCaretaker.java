package org.yurii.ooaplabs.semestry2.laba9Var10;

class BrakeSystemCaretaker {
    private BrakeSystemMemento memento;
    private BrakeSystem originator;

    public BrakeSystemCaretaker(BrakeSystem left, BrakeSystem right) {
        this.originator = left;
        this.memento = right.save();
    }

    public void switchToOther() {
        BrakeSystemMemento temp = originator.save();
        originator.restore(memento);
        memento = temp;
    }

    public void fix() {
        System.out.println(originator);
        System.out.println(memento + "\n");

        System.out.println("Fixing: " + originator.getBrakeComponents());
        originator.fix();
        switchToOther();

        System.out.println(originator);
        System.out.println(memento + "\n");

        System.out.println("Fixing: " + originator.getBrakeComponents());
        originator.fix();

        System.out.println(originator);
        System.out.println(memento);
    }

}
