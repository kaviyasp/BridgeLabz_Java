/*
Rock-Paper-Scissors game between user and computer
Hint =>
Create methods for computer choice, winner decision, stats calculation and display
*/

package CoreProgramming.String.Level2;

import java.util.Scanner;

class RockPaperScissors {

    // Generates computer's choice randomly
    static String computerChoice() {
        int r = (int)(Math.random() * 3);
        if (r == 0) return "rock";
        if (r == 1) return "paper";
        return "scissors";
    }

    // Determines the winner based on user and computer choices
    static String findWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if (user.equals("rock") && computer.equals("scissors")) return "User";
        if (user.equals("paper") && computer.equals("rock")) return "User";
        if (user.equals("scissors") && computer.equals("paper")) return "User";
        return "Computer";
    }

    public static void main(String[] args) {

        // Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        int userWins = 0, compWins = 0;

        // Display table header
        System.out.println("Game\tUser\tComputer\tWinner");

        // Loop to play the game multiple times
        for (int i = 1; i <= games; i++) {
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String user = sc.next();
            String computer = computerChoice();

            String winner = findWinner(user, computer);

            // Update win count
            if (winner.equals("User")) userWins++;
            if (winner.equals("Computer")) compWins++;

            System.out.println(i + "\t" + user + "\t" + computer + "\t\t" + winner);
        }

        // Calculate winning percentages
        double userPercent = (userWins * 100.0) / games;
        double compPercent = (compWins * 100.0) / games;

        // Display final statistics
        System.out.println("\nUser Wins: " + userWins + " (" + userPercent + "%)");
        System.out.println("Computer Wins: " + compWins + " (" + compPercent + "%)");
    }
}
