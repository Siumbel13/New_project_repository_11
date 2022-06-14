package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RepositoryTest {
    Repository repository = new Repository();
    Product product1 = new Book(1, "The Great Gatsby", 1000, "Francis Scott Fitzgerald");
    Product product2 = new Book(2, "The Count of Monte Cristo", 1500, "Alexandre Dumas");
    Product product3 = new Smartphone(3, "Iphone", 50_000, "Apple");
    Product product4 = new Smartphone(4, "Sony", 30_000, "Sony Mobile");

    @Test
    void shouldSave4product() {
        repository.save(product1);
        repository.save(product2);
        repository.save(product3);
        repository.save(product4);

        Product[] actual = repository.findAll();
        Product[] expected = {product1, product2, product3, product4};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void deleteProduct() {
        repository.save(product1);
        repository.save(product2);
        repository.save(product3);
        repository.save(product4);

        repository.removedById(2);

        Product[] actual = repository.findAll();
        Product[] expected = {product1, product3, product4};

        Assertions.assertArrayEquals(expected, actual);
    }
}
