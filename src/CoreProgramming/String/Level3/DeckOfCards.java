/*
Write a program to create a deck of cards, initialize the deck, shuffle the deck, and distribute the deck of n cards to x number of players. Finally, print the cards the players have.
Hint =>
Create a deck of cards with suits "Hearts", "Diamonds", "Clubs", "Spades" and ranks from "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", and "Ace"
Calculate the number of cards in the deck and initialize the deck
int numOfCards = suits.length * ranks.length;
Write a Method to Initialize the deck of cards with suits and ranks and return the deck. The deck is an array of strings where each string represents a card in the deck represented as "rank of suit" e.g., "2 of Hearts"
Write a Method to Shuffle the deck of cards and return the shuffled deck. To shuffle the card iterate over the deck and swap each card with a random card from the remaining deck
Write a Method to distribute the deck of n cards to x number of players and return the players
Write a Method to Print the players and their cards
*/

package CoreProgramming.String.Level3;

import java.util.Scanner;

class DeckOfCards {

    // Initializes the deck with all suit and rank combinations
    static String[] initializeDeck(String[] suits, String[] ranks) {

        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;

        // Nested loops to create each card
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index] = ranks[j] + " of " + suits[i];
                index++;
            }
        }
        return deck;
    }

    // Shuffles the deck using random swapping
    static String[] shuffleDeck(String[] deck) {

        int n = deck.length;

        // Loop to swap each card with a random card
        for (int i = 0; i < n; i++) {

            int randomCardNumber = i + (int) (Math.random() * (n - i));

            // Swap current card with random card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    // Distributes cards to players
    static String[][] distributeCards(String[] deck, int players, int cardsPerPlayer) {

        int totalCardsNeeded = players * cardsPerPlayer;

        // Check if distribution is possible
        if (totalCardsNeeded > deck.length) {
            return null;
        }

        String[][] playerCards = new String[players][cardsPerPlayer];
        int cardIndex = 0;

        // Nested loops to assign cards to each player
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playerCards[i][j] = deck[cardIndex];
                cardIndex++;
            }
        }
        return playerCards;
    }

    // Prints cards of each player
    static void printPlayersCards(String[][] players) {

        // Loop through players
        for (int i = 0; i < players.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + " cards:");

            // Loop through cards of a player
            for (int j = 0; j < players[i].length; j++) {
                System.out.println(players[i][j]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"};

        // Initialize and shuffle the deck
        String[] deck = initializeDeck(suits, ranks);
        deck = shuffleDeck(deck);

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = sc.nextInt();

        // Distribute cards
        String[][] distributedCards = distributeCards(deck, players, cardsPerPlayer);

        if (distributedCards == null) {
            System.out.println("Cannot distribute cards with given players and cards.");
        } else {
            printPlayersCards(distributedCards);
        }
    }
}
