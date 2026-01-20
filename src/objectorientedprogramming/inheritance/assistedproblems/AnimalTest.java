package objectorientedprogramming.inheritance.assistedproblems;

/*
Introduction of Inheritance
Assisted Problems
Animal Hierarchy
Description: Create a hierarchy where Animal is the superclass, and Dog, Cat, and Bird are subclasses. Each subclass has a unique behavior.
Tasks:
Define a superclass Animal with attributes name and age, and a method makeSound().
Define subclasses Dog, Cat, and Bird, each with a unique implementation of makeSound().
Goal: Learn basic inheritance, method overriding, and polymorphism with simple classes.
*/

// Superclass
class Animal {
    String name;
    int age;

    // Constructor to initialize animal details
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to be overridden by subclasses
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Dog class inherits Animal
class Dog extends Animal {

    Dog(String name, int age) {
        super(name, age); // calling parent constructor
    }

    // Overriding method
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Cat class inherits Animal
class Cat extends Animal {

    Cat(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println("Cat meows");
    }
}

// Bird class inherits Animal
class Bird extends Animal {

    Bird(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println("Bird chirps");
    }
}

// Main class
public class AnimalTest {
    public static void main(String[] args) {

        // Polymorphism: Animal reference pointing to child objects
        Animal a1 = new Dog("Buddy", 3);
        Animal a2 = new Cat("Kitty", 2);
        Animal a3 = new Bird("Parrot", 1);

        // Same method call, different outputs
        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}
