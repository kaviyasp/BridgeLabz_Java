package collectionsandstreams.generics.basic;

/*
 * Demonstrates simple and readable generics usage.
 */
public class SimpleGenericDemo<T> {

    private T value;

    public SimpleGenericDemo(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
