package collectionsandstreams.generics.basic;

import java.util.List;

/*
 * Demonstrates lower bounded wildcard for write operations.
 */
public class LowerBoundWildcardDemo {

    public static void addNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }
}
