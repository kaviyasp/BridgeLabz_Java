package datastructure.algorithmsruntimeanalysis;

/*
 This class compares different string concatenation techniques:
 1. Using String (immutable)
 2. Using StringBuilder (mutable, not thread-safe)
 3. Using StringBuffer (mutable, thread-safe)

 It demonstrates how immutability and synchronization
 affect performance for large concatenations.
 */
class StringConcatenation {

    // Uses String for concatenation
    // Each concatenation creates a new String object
    // Time Complexity: O(n^2)
    static String usingString(int n) {

        String s = "";

        // Repeated concatenation creates many temporary objects
        for (int i = 0; i < n; i++) {
            s += "a";
        }

        return s;
    }

    // Uses StringBuilder for concatenation
    // Mutable and faster for single-threaded environments
    // Time Complexity: O(n)
    static String usingStringBuilder(int n) {

        StringBuilder sb = new StringBuilder();

        // Appending modifies the same object
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }

        return sb.toString();
    }

    // Uses StringBuffer for concatenation
    // Thread-safe due to synchronization
    // Slightly slower than StringBuilder
    static String usingStringBuffer(int n) {

        StringBuffer sb = new StringBuffer();

        // Synchronized append operation
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }

        return sb.toString();
    }

    // Main method to compare execution time of all approaches
    public static void main(String[] args) {

        // Number of concatenations
        int n = 100_000;

        // Measure String concatenation time
        long start = System.currentTimeMillis();
        usingString(n);
        long end = System.currentTimeMillis();
        System.out.println("String Time: " + (end - start) + " ms");

        // Measure StringBuilder concatenation time
        start = System.currentTimeMillis();
        usingStringBuilder(n);
        end = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (end - start) + " ms");

        // Measure StringBuffer concatenation time
        start = System.currentTimeMillis();
        usingStringBuffer(n);
        end = System.currentTimeMillis();
        System.out.println("StringBuffer Time: " + (end - start) + " ms");
    }
}
