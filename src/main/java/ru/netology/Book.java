package ru.netology;

public class Book extends Product {
    public String author;

    public Book(int id, String name, int cost, String author) {
        super(id, name, cost);
        this.author = author;
    }
}
