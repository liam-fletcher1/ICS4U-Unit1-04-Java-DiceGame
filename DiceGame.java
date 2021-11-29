/*
* The guessing game
*
* @author Liam Fletcher
* @version 1.0
* @since 2021-11-29
*/

import java.util.Scanner;
/**
* The guessing game
*/

final class Main {
    /**
    * Variables 
    */
    static final int MAX = 6;

    /**
    * Variable
    */
    static final int MIN = 1;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * If this ever is called
    *
    * @throws IllegalStateException
    *
    */

    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {
        int tries = 0;
        int guess = 0;
        final int random = (int) Math.floor(Math.random() * (MAX - MIN + 1) + MIN);
        final Scanner attempt = new Scanner(System.in);
        while (true) {
            System.out.print("\nGuess a number between 1 and 6: ");
            try {
                guess = attempt.nextInt();
            } catch (java.util.InputMismatchException errorCode) {
                System.out.print("Invaild Input");
                break;
            }
            tries = tries + 1;
            if (guess > random) {
                System.out.print("Too high, try again.");
            } else if (guess < random) {
                System.out.print("Too low, try again.");
            } else {
                System.out.print("You got it right in " + tries + " guesses.");
                break;
            }
        }
        System.out.print("\nDone.");
    }
}
