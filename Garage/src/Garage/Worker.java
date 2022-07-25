package Garage;

import interfaces.AddressAble;

public class Worker implements AddressAble {
    String name;
    String add;
    int age;

    public Worker(String name, String add, int age) {
        this.name = name;
        this.add = add;
        this.age = age;
    }

    @Override
    public String getAdd() {
        return this.add;
    }
}
