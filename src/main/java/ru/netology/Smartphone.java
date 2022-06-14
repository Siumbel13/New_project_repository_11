package ru.netology;

public class Smartphone extends Product {

    public String manufacturer;

    public Smartphone(int id, String name, int cost, String manufacturer) {
        super(id, name, cost);
        this.manufacturer = manufacturer;
    }
}
