package org.yurii.ooaplabs.semestry1.laba4;

public class HourlyPaymentMethod implements PaymentMethod {
    private double hoursWorked;

    public HourlyPaymentMethod(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * 50;
    }

    @Override
    public String getName() {
        return "Hourly Payment";
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
}
