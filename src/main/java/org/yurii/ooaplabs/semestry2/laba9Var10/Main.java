package org.yurii.ooaplabs.semestry2.laba9Var10;

public class Main {
    public static void main(String[] args) {
        BrakeSystem leftBrakeSystem = new BrakeSystem("Left brake components");
        BrakeSystem rightBrakeSystem = new BrakeSystem("Right brake components");

        BrakeSystemCaretaker caretaker = new BrakeSystemCaretaker(leftBrakeSystem, rightBrakeSystem);

        caretaker.fix();
    }
}

