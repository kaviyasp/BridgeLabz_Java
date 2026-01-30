package collectionsandstreams.generics.basic;

/*
 * Demonstrates composition with generics.
 */
class DataHolder<T> {
    T data;

    DataHolder(T data) {
        this.data = data;
    }
}

public class CompositionOverInheritanceDemo {

    public static void main(String[] args) {
        DataHolder<String> holder = new DataHolder<>("Java");
        System.out.println(holder.data);
    }
}
