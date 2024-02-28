package org.yurii.ooaplabs.semestry1.module2;

interface Discount {
    double applyDiscount(double basePrice);
}

class FullPaymentDiscount implements Discount {
    @Override
    public double applyDiscount(double basePrice) {
        return basePrice * 0.95;
    }
}

class CreditPaymentDiscount implements Discount {
    @Override
    public double applyDiscount(double basePrice) {
        return basePrice;
    }
}

class InstallmentPaymentDiscount implements Discount {
    @Override
    public double applyDiscount(double basePrice) {
        return basePrice * 1.1;
    }
}

interface DiscountFactory {
    Discount createDiscount();
}

class FullPaymentDiscountFactory implements DiscountFactory {
    @Override
    public Discount createDiscount() {
        return new FullPaymentDiscount();
    }
}

class CreditPaymentDiscountFactory implements DiscountFactory {
    @Override
    public Discount createDiscount() {
        return new CreditPaymentDiscount();
    }
}

class InstallmentPaymentDiscountFactory implements DiscountFactory {
    @Override
    public Discount createDiscount() {
        return new InstallmentPaymentDiscount();
    }
}

abstract class Customer {
    Discount discount;

    public Customer(Discount discount) {
        this.discount = discount;
    }

    abstract String getInsurancePlan();

    abstract String getWarrantyService();

    public void purchaseCar(Car car) {
        double finalPrice = discount.applyDiscount(car.basePrice);

        System.out.println("Продано автомобіль " + car.brand + " " + car.model +
                " за ціною " + finalPrice +
                " зі страховкою '" + getInsurancePlan() + "'" +
                " та гарантійним обслуговуванням '" + getWarrantyService() + "'");
    }
}

class FullPaymentCustomer extends Customer {
    public FullPaymentCustomer(Discount discount) {
        super(discount);
    }

    @Override
    String getInsurancePlan() {
        return "Стандартна страховка";
    }

    @Override
    String getWarrantyService() {
        return "Стандартне гарантійне обслуговування";
    }
}

class CreditPaymentCustomer extends Customer {
    public CreditPaymentCustomer(Discount discount) {
        super(discount);
    }

    @Override
    String getInsurancePlan() {
        return "Страховка для кредиту";
    }

    @Override
    String getWarrantyService() {
        return "Гарантійне обслуговування для кредиту";
    }
}

class InstallmentPaymentCustomer extends Customer {
    public InstallmentPaymentCustomer(Discount discount) {
        super(discount);
    }

    @Override
    String getInsurancePlan() {
        return "Страховка для розтермінування";
    }

    @Override
    String getWarrantyService() {
        return "Гарантійне обслуговування для розтермінування";
    }
}

class Car {
    String model;
    String brand;
    String configuration;
    double basePrice;

    public Car(String model, String brand, String configuration, double basePrice) {
        this.model = model;
        this.brand = brand;
        this.configuration = configuration;
        this.basePrice = basePrice;
    }
}

public class Main {
    public static void main(String[] args) {
        DiscountFactory fullPaymentDiscountFactory = new FullPaymentDiscountFactory();
        DiscountFactory creditPaymentDiscountFactory = new CreditPaymentDiscountFactory();
        DiscountFactory installmentPaymentDiscountFactory = new InstallmentPaymentDiscountFactory();

        Discount fullPaymentDiscount = fullPaymentDiscountFactory.createDiscount();
        Discount creditPaymentDiscount = creditPaymentDiscountFactory.createDiscount();
        Discount installmentPaymentDiscount = installmentPaymentDiscountFactory.createDiscount();

        Customer fullPaymentCustomer = new FullPaymentCustomer(fullPaymentDiscount);
        Customer creditPaymentCustomer = new CreditPaymentCustomer(creditPaymentDiscount);
        Customer installmentPaymentCustomer = new InstallmentPaymentCustomer(installmentPaymentDiscount);

        Car car = new Car("Model X", "Tesla", "Standard", 50000);

        fullPaymentCustomer.purchaseCar(car);
        creditPaymentCustomer.purchaseCar(car);
        installmentPaymentCustomer.purchaseCar(car);
    }
}
