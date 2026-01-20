/*
WWrite a program to demonstrate NullPointerException.
Hint =>
Write a Method to generate the Exception. Here define the variable text and initialize it to null. Then call one of the String Method to generate the exception
Write the Method to demonstrate NullPointerException. Here define the variable text and initialize it to null. Then write try catch block for handling the Exception while accessing one of the String method
From the main Firstly call the method to generate the Exception then refactor the code to call the method to handle the RuntimeException
*/

package CoreProgramming.String.Level1;

class NullPointerDemo {

    // Method that generates NullPointerException
    static void generateException() {
        String text = null;              // text initialized to null
        System.out.println(text.length()); // Accessing method on null
    }

    // Method that handles NullPointerException using try-catch
    static void handleException() {
        try {
            String text = null;          // text initialized to null
            System.out.println(text.length()); // Causes exception
        } catch (NullPointerException e) {
            // Handling NullPointerException
            System.out.println("NullPointerException caught");
        }
    }

    public static void main(String[] args) {

        System.out.println("Generating NullPointerException");

        // Calling method that handles the exception
        handleException();
    }
}
