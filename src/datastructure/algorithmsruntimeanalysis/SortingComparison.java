package datastructure.algorithmsruntimeanalysis;

/*
 This class compares two sorting approaches:
 1. Bubble Sort (inefficient for large inputs)
 2. Built-in efficient sort (optimized algorithm)

 The goal is to observe time complexity differences
 when sorting large datasets.
 */
class SortingComparison {

    // Bubble Sort implementation
    // Time Complexity:
    // Best Case: O(n)
    // Average Case: O(n^2)
    // Worst Case: O(n^2)
    static void bubbleSort(int[] arr) {

        // Outer loop controls number of passes
        for (int i = 0; i < arr.length; i++) {

            // Inner loop compares adjacent elements
            // After each pass, the largest element moves to the end
            for (int j = 0; j < arr.length - i - 1; j++) {

                // Swap if elements are in wrong order
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Uses Java's built-in sorting method
    // Internally uses Dual-Pivot QuickSort (for primitives)
    // Time Complexity (average): O(n log n)
    static void efficientSort(int[] arr) {
        java.util.Arrays.sort(arr);
    }

    // Main method to compare execution time of both sorting techniques
    public static void main(String[] args) {

        // Size of the array (large input for performance comparison)
        int size = 10_000;

        // Two identical arrays for fair comparison
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        // Initialize arrays in reverse order (worst case for Bubble Sort)
        for (int i = 0; i < size; i++) {
            arr1[i] = size - i;
            arr2[i] = size - i;
        }

        // Measure Bubble Sort execution time
        long start = System.currentTimeMillis();
        bubbleSort(arr1);
        long end = System.currentTimeMillis();
        System.out.println("Bubble Sort Time: " + (end - start) + " ms");

        // Measure Efficient Sort execution time
        start = System.currentTimeMillis();
        efficientSort(arr2);
        end = System.currentTimeMillis();
        System.out.println("Efficient Sort Time: " + (end - start) + " ms");
    }
}
