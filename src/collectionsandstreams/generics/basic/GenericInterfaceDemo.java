package collectionsandstreams.generics.basic;

/*
 * Generic interface for common behavior.
 */
interface Container<T> {
    void add(T item);
}

/*
 * Implementation of generic interface.
 */
public class GenericInterfaceDemo implements Container<String> {

    @Override
    public void add(String item) {
        System.out.println("Added: " + item);
    }
}
