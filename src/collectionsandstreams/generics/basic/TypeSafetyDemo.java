package collectionsandstreams.generics.basic;

import java.util.ArrayList;
import java.util.List;

/*
 * Program: TypeSafetyDemo
 * Description: Demonstrates how Generics ensure type safety
 * by enforcing compile-time type checking and preventing
 * ClassCastException at runtime.
 */
public class TypeSafetyDemo {

    public static void main(String[] args) {

        // Generic List ensures type safety
        List<String> names = new ArrayList<>();

        // Only String values are allowed
        names.add("Jayanthi");
        names.add("Java Generics");

        // names.add(10); // ❌ Compile-time error (type safety)

        // No type casting required
        for (String name : names) {
            System.out.println(name);
        }
    }
}
