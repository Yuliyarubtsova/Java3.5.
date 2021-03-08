package ru.netology.manager;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;
import ru.netology.domain.Book;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doNothing;


@ExtendWith(MockitoExtension.class)
class ProductManagerTest {
    @Mock
    private ProductRepository repository;
    @InjectMocks
    private ProductManager manager;
    private Product first = new Book(1, "First", 10, "Тургенев");
    private Product second = new Book(2, "Second", 20, "Маршак");
    private Product third = new Book(3, "Sony", 30, "Толстой");
    private Product fourth = new Book(4, "Fourth", 40, "Бианки");
    private Product fifth = new Book(5, "Fifth", 50, "Бронте");
    private Product sixth = new Smartphone(6, "Sixth", 60, "Samsung");
    private Product seventh = new Smartphone(7, "Seventh", 70, "Apple");
    private Product eighth = new Smartphone(8, "Бронте", 80, "Nokia");
    private Product ninth = new Smartphone(9, "Ninth", 90, "Second");
    private Product tenth = new Smartphone(10, "Tenth", 100, "Sony");

    @Test
    public void shouldSearchByAuthor() {
        Product[] returned = new Product[]{first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth};

        doReturn(returned).when(repository).findAll();

        Product[] actual = manager.searchBy("Бронте");
        Product[] expected = new Product[]{fifth, eighth};

        assertArrayEquals(actual, expected);
    }


    @Test
    public void shouldSearchByManufacturer() {
        Product[] returned = new Product[]{first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth};

        doReturn(returned).when(repository).findAll();

        Product[] actual = manager.searchBy("Sony");
        Product[] expected = new Product[]{third, tenth};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldSearchByAnotherProduct () {
        Product[] returned = new Product[]{first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth};

        doReturn(returned).when(repository).findAll();

        Product[] actual = manager.searchBy("Гоголь");
        Product[] expected = new Product[]{};

        assertArrayEquals(actual, expected);
    }
}


