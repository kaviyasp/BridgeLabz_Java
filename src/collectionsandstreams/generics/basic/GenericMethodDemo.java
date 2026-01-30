package collectionsandstreams.generics.basic;

/*
 * Demonstrates using a generic method instead of overloading.
 */
public class GenericMethodDemo {

    // Generic method
    public static <T> void printData(T data) {
        System.out.println(data);
    }

    public static void main(String[] args) {
        printData("Java");
        printData(10);
        printData(3.14);
    }
}
