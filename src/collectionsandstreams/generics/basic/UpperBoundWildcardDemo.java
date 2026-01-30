package collectionsandstreams.generics.basic;

import java.util.List;

/*
 * Demonstrates upper bounded wildcard for read-only access.
 */
public class UpperBoundWildcardDemo {

    public static void displayNumbers(List<? extends Number> numbers) {
        for (Number num : numbers) {
            System.out.println(num);
        }
    }
}
