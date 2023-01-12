package com.test;

import org.testng.annotations.Test;
import pets.Alien;
import pets.Dog;
import pets.Snake;
import pets.Tarantula;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class PetTest {
    Alien alien = new Alien();
    Dog dog = new Dog("Milo", "Black", 2, 4);
    Snake snake = new Snake("Slith", "green", 1, 0);
    Tarantula tarantula = new Tarantula("Legs", "black", 6, 8);

    @Test
    public void validateAlien() {
        assertEquals(alien.getName().length(), 5);

        String color = alien.getColor();
        assertTrue(color.length() >= 3 && color.length() <= 6);

        int age = alien.getAge();
//        System.out.println("age : " + alien.getAge());
        assertTrue(age < 2600);

        int numberOfLegs = alien.getNumberOfLegs();
//        System.out.println("legs : " + alien.getNumberOfLegs());
        assertTrue(numberOfLegs < 20);
    }

    @Test
    public void validateDog() {
        String name =dog.getName();
//        System.out.println("name : " + dog.getName());
        assertEquals(name, "Milo");

        String color = dog.getColor();
//        System.out.println("color : " + dog.getColor());
        assertEquals(color, "Black");

        int age = dog.getAge();
//        System.out.println("age : " + dog.getAge());
        assertEquals(age, 2);
        int numberOfLegs = dog.getNumberOfLegs();
//        System.out.println("legs : " + dog.getNumberOfLegs());
        assertEquals(numberOfLegs, 4);
    }

    @Test
    public void validateSnake() {
        String name = snake.getName();
//        System.out.println("name : " + snake.getName());
        assertEquals(name, "Slith");

        String color = snake.getColor();
//        System.out.println("color : " + snake.getColor());
        assertEquals(color, "green");

        int age = snake.getAge();
//        System.out.println("age : " + snake.getAge());
        assertEquals(age, 1);
        int numberOfLegs = snake.getNumberOfLegs();
//        System.out.println("legs : " + snake.getNumberOfLegs());
        assertEquals(numberOfLegs, 0);
    }

    @Test
    public void validateTarantula() {
        String name = tarantula.getName();
//        System.out.println("name : " + tarantula.getName());
        assertEquals(name, "Legs");

        String color = tarantula.getColor();
//        System.out.println("color : " + tarantula.getColor());
        assertEquals(color, "black");

        int age = tarantula.getAge();
//        System.out.println("age : " + tarantula.getAge());
        assertEquals(age, 6);
        int numberOfLegs = tarantula.getNumberOfLegs();
//        System.out.println("legs : " + tarantula.getNumberOfLegs());
        assertEquals(numberOfLegs, 8);
    }
}
