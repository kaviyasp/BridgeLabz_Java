/*
Create a program to find the shortest, tallest, and mean height of players present in a football team.
Hint =>
The formula to calculate the mean is: mean = sum of all elements/number of elements
Create an int array named heights of size 11 and get 3 digits random height in cms for each player in the range 150 cms to 250 cms
Write the method to Find the sum of all the elements present in the array.
Write the method to find the mean height of the players on the football team
Write the method to find the shortest height of the players on the football team
Write the method to find the tallest height of the players on the football team
Finally display the results
*/

package CoreProgramming.Methods.Level3;

class FootballTeamHeight {

    // Calculates sum of all heights
    static int sum(int[] heights) {
        int s = 0;
        for (int h : heights) {      // Loop to add all heights
            s += h;
        }
        return s;
    }

    // Calculates mean height of the players
    static double mean(int[] heights) {
        return (double) sum(heights) / heights.length;
    }

    // Finds the shortest height
    static int shortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {      // Loop to find minimum height
            if (h < min) min = h;
        }
        return min;
    }

    // Finds the tallest height
    static int tallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {      // Loop to find maximum height
            if (h > max) max = h;
        }
        return max;
    }

    public static void main(String[] args) {

        int[] heights = new int[11];

        // Loop to generate random heights for 11 players
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101) + 150;
            System.out.print(heights[i] + " ");
        }
        System.out.println();

        // Display shortest, tallest, and mean height
        System.out.println("Shortest Height: " + shortest(heights));
        System.out.println("Tallest Height: " + tallest(heights));
        System.out.println("Mean Height: " + mean(heights));
    }
}
