package collectionsandstreams.generics.basic;

/*
 * Demonstrates generic constructor.
 */
public class GenericConstructorDemo {

    public <T> GenericConstructorDemo(T value) {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        new GenericConstructorDemo("Java");
        new GenericConstructorDemo(100);
    }
}
