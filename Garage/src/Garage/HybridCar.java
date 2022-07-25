package Garage;

import Customers.Customer;

public class HybridCar extends Car{
    int cellNum;

    public HybridCar(String licensePlate, int model, int manufacturer, int km, Customer customer, int discount, int cellNum, int accidents) {
        super(licensePlate, model, manufacturer, km, customer, discount,accidents);
        this.cellNum = cellNum;
    }

    @Override
    public String toString() {

        return "HybridCar{" +
                "licensePlate='" + licensePlate + '\'' +
                ", model=" + model +
                ", manufacturer=" + manufacturer +
                ", km=" + km +
                ", customer=" + customer +
                ", discount=" + discount +
                ", cellNum=" + cellNum +
                '}';
    }
}
