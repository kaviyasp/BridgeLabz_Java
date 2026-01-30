package collectionsandstreams.generics.basic;

import java.util.List;

/*
 * Demonstrates generics with Streams API.
 */
public class GenericsWithStreamsDemo {

    public static void main(String[] args) {

        List<String> names = List.of("Java", "Python", "C++");

        names.stream()
                .filter(name -> name.startsWith("J"))
                .forEach(System.out::println);
    }
}
