package ObjectOrientedProgramming.Constructors;

/*
Create a Person class with a copy constructor that clones another person's attributes.
*/
class Person {

    String name;
    int age;

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor: copies data from another object
    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    void display() {
        System.out.println(name + " - " + age);
    }

    public static void main(String[] args) {

        // First object created with original data
        Person p1 = new Person("Kaviya", 20);

        // Second object created by copying first object
        Person p2 = new Person(p1);

        // Both objects have same values but are different objects
        p1.display();
        p2.display();
    }
}
