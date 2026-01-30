package collectionsandstreams.generics.basic;

import java.util.ArrayList;
import java.util.List;

/*
 * Demonstrates why raw types should be avoided.
 */
public class RawTypeVsGenericDemo {

    public static void main(String[] args) {

        // Generic List (recommended)
        List<String> names = new ArrayList<>();
        names.add("Java");

        // Raw List (not recommended)
        List rawList = new ArrayList();
        rawList.add("Java");
        rawList.add(10); // Allowed, but unsafe
    }
}
