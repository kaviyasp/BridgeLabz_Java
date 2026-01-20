/*
Write a program that generates five 4 digit random values and then finds their average value, and their minimum and maximum value. Use Math.random(), Math.min(), and Math.max().
Hint =>
Write a method that generates array of 4 digit random numbers given the size as a parameter as shown in the method signature
public int[] generate4DigitRandomArray(int size)
Write a method to find average, min and max value of an array
public double[] findAverageMinMax(int[] numbers)
*/

package CoreProgramming.Methods.Level2;

class RandomNumbersAnalysis {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {

        // Create an array to store random numbers
        int[] numbers = new int[size];

        // Generate 4-digit random numbers and store in array
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }

        return numbers;
    }

    // Method to find average, minimum, and maximum of the array
    public static double[] findAverageMinMax(int[] numbers) {

        // Initialize min and max with first element
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        // Loop through array to calculate sum, min, and max
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }

        // Calculate average value
        double average = (double) sum / numbers.length;

        // Return average, min, and max as an array
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {

        // Generate five 4-digit random numbers
        int[] numbers = generate4DigitRandomArray(5);

        // Print generated numbers
        System.out.println("Generated Numbers:");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        // Find average, minimum, and maximum
        double[] result = findAverageMinMax(numbers);

        // Print results
        System.out.println("Average: " + result[0]);
        System.out.println("Minimum: " + result[1]);
        System.out.println("Maximum: " + result[2]);
    }
}
