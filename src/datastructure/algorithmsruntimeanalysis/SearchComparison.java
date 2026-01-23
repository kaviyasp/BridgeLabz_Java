package datastructure.algorithmsruntimeanalysis;

/*
 This class compares two searching techniques:
 1. Linear Search (sequential search)
 2. Binary Search (divide and conquer)

 It demonstrates how algorithm choice affects performance,
 especially for large datasets.
 */
class SearchComparison {

    // Linear Search implementation
    // Time Complexity:
    // Best Case: O(1)   -> element found at first index
    // Average Case: O(n)
    // Worst Case: O(n)  -> element at last index or not present
    static int linearSearch(int[] arr, int target) {

        // Traverse array element by element
        for (int i = 0; i < arr.length; i++) {

            // Check if current element matches target
            if (arr[i] == target)
                return i;  // element found
        }

        // Element not found
        return -1;
    }

    // Binary Search implementation (requires sorted array)
    // Time Complexity:
    // Best Case: O(1)
    // Average Case: O(log n)
    // Worst Case: O(log n)
    static int binarySearch(int[] arr, int target) {

        // Define search boundaries
        int low = 0, high = arr.length - 1;

        // Continue searching while valid range exists
        while (low <= high) {

            // Find middle index
            int mid = (low + high) / 2;

            // If target found at mid
            if (arr[mid] == target)
                return mid;

                // If target is greater, ignore left half
            else if (arr[mid] < target)
                low = mid + 1;

                // If target is smaller, ignore right half
            else
                high = mid - 1;
        }

        // Element not found
        return -1;
    }

    // Main method to compare execution time of searching algorithms
    public static void main(String[] args) {

        // Large dataset size for performance comparison
        int size = 1_000_000;

        // Sorted array (required for binary search)
        int[] arr = new int[size];

        // Initialize array with sorted values
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }

        // Target element (worst-case scenario for linear search)
        int target = size - 1;

        // Measure Linear Search execution time
        long start = System.currentTimeMillis();
        linearSearch(arr, target);
        long end = System.currentTimeMillis();
        System.out.println("Linear Search Time: " + (end - start) + " ms");

        // Measure Binary Search execution time
        start = System.currentTimeMillis();
        binarySearch(arr, target);
        end = System.currentTimeMillis();
        System.out.println("Binary Search Time: " + (end - start) + " ms");
    }
}
