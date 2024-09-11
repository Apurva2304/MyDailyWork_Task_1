
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int score = 0;
        int roundsWon = 0;
        int numberOfAttemptsAllowed = 6;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            int randomNumber = random.nextInt(100) + 1;
            int numberOfAttempts = 0;

            System.out.println("Welcome to the number guessing game!");
            System.out.println( "Number between 1 and 100.");
            System.out.println("You have " + numberOfAttemptsAllowed + " attempts to guess the number.");

            while (numberOfAttempts < numberOfAttemptsAllowed) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                numberOfAttempts++;

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed the number in " + numberOfAttempts + " attempts.");
                    score += 10 - numberOfAttempts;
                    roundsWon++;
                    break;
                } else if (userGuess > randomNumber) {
                    System.out.println("Your guess is too high.");
                } else {
                    System.out.println("Your guess is too low.");
                }
            }

            if (numberOfAttempts == numberOfAttemptsAllowed) {
                System.out.println("Game over! The number was " + randomNumber + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next();

            if (playAgain.equalsIgnoreCase("no")) {
                break;
            }
        }

        System.out.println("Your final score is " + score + ". You won " + roundsWon + " rounds.");
    }
}