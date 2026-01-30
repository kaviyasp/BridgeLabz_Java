package collectionsandstreams.generics.basic;

/*
 * Demonstrates type erasure limitation.
 */
public class TypeErasureDemo<T> {

    // Cannot use instanceof with generic type T
    public void check(Object obj) {
        // if (obj instanceof T) ❌ Not allowed
        System.out.println("Type erasure removes generic info at runtime");
    }
}
