package org.yurii.ooaplabs.semestry1.laba4;

public class ContractPaymentMethod implements PaymentMethod {
    private double tasksDone;

    public ContractPaymentMethod(double tasksDone) {
        this.tasksDone = tasksDone;
    }

    @Override
    public double calculateSalary() {
        return tasksDone * 100;
    }

    @Override
    public String getName() {
        return "Contract payment";
    }

    public double getTasksDone() {
        return tasksDone;
    }
}
