package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    @Test
    public void shouldHaveAllMethodsFieldsFromSuper() {
        Smartphone smartphone = new Smartphone();
    }

    @Test
    public void shouldEqualsSmartphone() {
        Smartphone smartphone1 = new Smartphone(1, "Java", 10, "Apple");
        Smartphone smartphone2 = new Smartphone(1, "Java", 10, "Apple");

        assertEquals(smartphone1, smartphone2);

    }
}