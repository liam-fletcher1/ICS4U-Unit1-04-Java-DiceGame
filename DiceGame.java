/*
 * The guessing game program
 *
 * @author  Liam Fletcher
 * @version 1.0
 * @since   2021-11-27
 */

import java.util.Scanner;

/**
 * The guessing game program
 */
final class Main {

    /**
     * Throw an exception IllegalStateException.
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        throw new IllegalStateException("Invaild Input");
    }

    /**
     * The main() function.
     *
     * @param args No args will be used
     */
    public static void main(final String[] args) {

        // Variables
        int guess;

        // Constants
        final int lowestNum = 1;
        final int highestNum = 6;
        final int extra = 1;

        // Generate random number 
        final int randomNumb = (int)(Math.random() * (highestNum -
            lowestNum + extra) + lowestNum);

        // Create scanner objects 
        final Scanner myObjOne = new Scanner(System.in);
        // Ask for inputs
        System.out.println("Guess a number between 1 and 6: ");
        guess = myObjOne.nextInt();
        /*
         * This accepts an inputted
         */
        try {
            do {

                // Calculate
                if (guess < lowestNum || guess > highestNum) {
                    System.out.println("Your guess won't count. Guess again.");
                } else if (guess < randomNumb) {
                    System.out.println("You guessed too low. Guess again.");
                } else if (guess > randomNumb) {
                    System.out.println("You guessed too high. Guess again.");
                } else {
                    System.out.println("Invaild Input");
                    break;
                }

                //Input
                System.out.println("Guess a number between 1 to 6: ");
                guess = myObjOne.nextInt();

            } while (guess != randomNumb);

            // Output
            System.out.println("You guessed correctly!");
        } catch (java.util.InputMismatchException ex) {
            System.out.println("Invaild Input");
        } finally {
            System.out.println("\nDone.");
        }
    }
}
