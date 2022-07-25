package Tester;

import Customers.Customer;
import Garage.Car;
import Garage.Worker;
import interfaces.AddressAble;


public class Tester {
    public static void main(String[] args) {
        Customer ram = new Customer("Ram", "050-555-5555", 31, "Savyon");
        //Customer hila = new Customer("Hila", "054-123-4567",23,"Tel Aviv");

        Car ramCar = new Car("555-55-555",
                10, //Mercedes
                20, //CLS-500
                5000,
                ram,
                0,
                0
        );
        Car hilaCar = new Car(
                "12-345-66",
                30, //corsa
                45, //opel
                600_000, //km
                new Customer("Hila", "054-123-4567",23,"Tel Aviv"),
                50,
                100
        );

        Customer hila = hilaCar.getDriver();
        Worker zeev = new Worker("zeev","q.yam", 46);

        AddressAble[] address = new AddressAble[3];

        address[0] = ram;
        address[1] = zeev;
        address[2] = hila;

        /*
        for (int index=0;index<address.length;index+=1){
            System.out.println(address[index].getAdd());
        }
         */

        for (AddressAble item:address){
            System.out.println(item.getAdd());
            if (item instanceof Customer){
                ((Customer) item).setDiscount(10);
                //Customer customer = (Customer) item;
                //customer.setDiscount(15);
            }

        }



    }
}
