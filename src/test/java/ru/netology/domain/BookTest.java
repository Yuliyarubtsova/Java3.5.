package ru.netology.domain;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    public void shouldHaveAllMethodsFieldsFromSuper() {
        Book book = new Book();
    }

    @Test
    public void shouldEquals() {
        Book book1 = new Book(1, "Java", 10, "A");
        Book book2 = new Book(1, "Java", 10, "A");

        assertEquals(book1, book2);

    }
}