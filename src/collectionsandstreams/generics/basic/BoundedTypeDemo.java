package collectionsandstreams.generics.basic;

/*
 * Demonstrates bounded type parameters.
 */
public class BoundedTypeDemo<T extends Number> {

    private T value;

    public BoundedTypeDemo(T value) {
        this.value = value;
    }

    public double getDoubleValue() {
        return value.doubleValue();
    }
}
