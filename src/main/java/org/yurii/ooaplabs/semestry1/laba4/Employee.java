package org.yurii.ooaplabs.semestry1.laba4;

public class Employee {
    private String name;
    private String position;
    private PaymentMethod paymentMethod;

    public Employee(String name, String position, PaymentMethod paymentMethod) {
        this.name = name;
        this.position = position;
        this.paymentMethod = paymentMethod;
    }

    public double getSalary() {
        return paymentMethod.calculateSalary();
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", paymentMethod=" + paymentMethod.getName() +
                ", salary= " + paymentMethod.calculateSalary() +
                '}';
    }
}