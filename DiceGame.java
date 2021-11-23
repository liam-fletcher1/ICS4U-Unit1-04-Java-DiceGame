/*
 * The guessing game program
 *
 * @author  Liam Fletcher
 * @version 1.0
 * @since   2021-11-23
 */

import java.util.Scanner;

public final class DiceGame {
    private DiceGame() {

    }
    /**
     * The guessing game program
     */
    public static void main(final String[] args) {

        // The guess counter
        int Guesses = 0;

        try {
            // Random Number
            final int randomNum = (int)(Math.random() * (6 - 1)) + 1;

            // Process
            while (true) {
                // User Input
                Scanner guess = new Scanner(System.in);
                System.out.println("Guess a number between 1 and 6");
                int Guess = guess.nextInt();

                // Guess counter
                Guesses = Guesses + 1;

                if (Guess == randomNum) {
                    // Output if correct
                    System.out.println("Correct, it took you " +
                        Guesses + " tries.");
                    break;
                } else {
                    // Output if wrong 
                    System.out.println("Wrong, guess again");
                }
            }

            // Catches invaild inputs
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }
    }
}
