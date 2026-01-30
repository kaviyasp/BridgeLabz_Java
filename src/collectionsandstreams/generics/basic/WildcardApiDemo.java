package collectionsandstreams.generics.basic;

import java.util.List;

/*
 * Demonstrates avoiding wildcards in return types.
 */
public class WildcardApiDemo {

    public static List<String> getNames(List<String> names) {
        return names;
    }
}
