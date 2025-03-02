import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Step 1: Welcome message and instructions
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Can you guess it?");

        // Step 2: Generate a random number between 1 and 100
        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;
        boolean hasGuessed = false;

        // Step 3: Allow the user to guess the number
        while (!hasGuessed) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            // Step 4: Compare the guess with the secret number
            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                hasGuessed = true;
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

            // Optional: Limit the number of attempts
            if (attempts >= 10) {
                System.out.println("You've used all your attempts. The correct number was " + secretNumber + ".");
                break;
            }
        }

        // Step 5: Ask if the user wants to play again
        System.out.print("Do you want to play again? (yes/no): ");
        String playAgain = scanner.next();

        if (playAgain.equalsIgnoreCase("yes")) {
            main(args); // Restart the game
        } else {
            System.out.println("Thanks for playing! Goodbye!");
        }

        scanner.close();
    }
}