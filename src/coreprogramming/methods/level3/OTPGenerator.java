/*
Write a program to generate a six-digit OTP number using Math.random() method. Validate the numbers are unique by generating the OTP number 10 times and ensuring all the 10 OTPs are not the same
Hint =>
Write a method to Generate a 6-digit OTP number using Math.random()
Create an array to save the OTP numbers generated 10 times
Write a method to ensure that the OTP numbers generated are unique
*/

package CoreProgramming.Methods.Level3;

class OTPGenerator {

    // Generates a random 6-digit OTP
    static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }

    // Checks whether all OTPs in the array are unique
    static boolean isUnique(int[] otps) {

        // Loop to compare each OTP with others
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        // Array to store 10 generated OTPs
        int[] otps = new int[10];

        // Loop to generate and display OTPs
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }

        // Display whether all OTPs are unique
        System.out.println("All OTPs Unique: " + isUnique(otps));
    }
}
