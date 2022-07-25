package Customers;

import interfaces.AddressAble;

public class Customer implements AddressAble {
    String name;
    String phone;
    int age;
    String address;
    int customerDiscount=0;

    public Customer(String name, String phone, int age, String address) {
        this.name = name;
        this.phone = phone;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public String getAdd() {
        return this.address;
    }

    public void setDiscount(int discount){
        this.customerDiscount=discount;
    }
}
