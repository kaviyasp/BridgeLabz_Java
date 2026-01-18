package ObjectOrientedProgramming.Inheritance.HybridInheritance;

/*
Hybrid Inheritance (Simulating Multiple Inheritance)
Since Java doesn’t support multiple inheritance directly, hybrid inheritance is typically achieved through interfaces.
Sample Problem 1: Restaurant Management System with Hybrid Inheritance
Description: Model a restaurant system where Person is the superclass and Chef and Waiter are subclasses. Both Chef and Waiter should implement a Worker interface that requires a performDuties() method.
Tasks:
Define a superclass Person with attributes like name and id.
Create an interface Worker with a method performDuties().
Define subclasses Chef and Waiter that inherit from Person and implement the Worker interface, each providing a unique implementation of performDuties().
Goal: Practice hybrid inheritance by combining inheritance and interfaces, giving multiple behaviors to the same objects.
*/

// Interface representing work behavior
interface Worker {
    void performDuties();
}

// Superclass
class Person {
    String name;
    int id;

    // Constructor to initialize person details
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

// Chef class extends Person and implements Worker
class Chef extends Person implements Worker {

    Chef(String name, int id) {
        super(name, id);
    }

    // Implementation of interface method
    public void performDuties() {
        System.out.println(name + " is preparing food in the kitchen");
    }
}

// Waiter class extends Person and implements Worker
class Waiter extends Person implements Worker {

    Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println(name + " is serving food to customers");
    }
}

// Main class
public class RestaurantTest {
    public static void main(String[] args) {

        Worker chef = new Chef("Ravi", 101);
        Worker waiter = new Waiter("Anita", 102);

        // Polymorphism using interface reference
        chef.performDuties();
        waiter.performDuties();
    }
}
