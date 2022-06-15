package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductManagerTest {
    ProductManager manager = new ProductManager(new Repository());
    Product product1 = new Book(1, "The Great Gatsby", 1000, "Francis Scott Fitzgerald");
    Product product2 = new Book(2, "The Count of Monte Cristo", 1500, "Alexandre Dumas");
    Product product3 = new Smartphone(3, "Iphone", 50_000, "USA");
    Product product4 = new Smartphone(4, "Sony", 30_000, "Japan");

    @Test
    void shouldFind0Products() {

        manager.add(product1);
        manager.add(product2);
        manager.add(product3);
        manager.add(product4);

        Product[] actual = manager.searchBy("qwe");
        Product[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldAddFind1Products() {
        manager.add(product1);
        manager.add(product2);
        manager.add(product3);
        manager.add(product4);

        Product[] actual = manager.searchBy("Gat");
        Product[] expected = {product1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFind3Products() {
        manager.add(product1);
        manager.add(product2);
        manager.add(product3);
        manager.add(product4);

        Product[] actual = manager.searchBy("on");
        Product[] expected = {product2, product3, product4};

        Assertions.assertArrayEquals(expected, actual);
    }
}
