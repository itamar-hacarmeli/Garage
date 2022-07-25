package Garage;

import Customers.Customer;

public class Car {
    String licensePlate;
    int model;
    int manufacturer;
    int km;
    Customer customer;
    int discount;
    int accident;

    public Car(String licensePlate, int model, int manufacturer, int km, Customer customer, int discount, int accident) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.manufacturer = manufacturer;
        this.km = km;
        this.customer = customer;
        this.discount = discount;
        this.accident=accident;
    }

    @Override
    public String toString() {
        return "Car{" +
                "licensePlate='" + licensePlate + '\'' +
                ", model=" + model +
                ", manufacturer=" + manufacturer +
                ", km=" + km +
                ", customer=" + customer +
                ", discount=" + discount +
                '}';
    }

    public Customer getDriver(){
        return this.customer;
    }
}
