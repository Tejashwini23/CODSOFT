/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessthenumber;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tejteju
 */
public class GuessTheNumber {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int totalAttempts = 0;
        int totalRounds = 0;

        System.out.println("Welcome to the Guess the Number game and enjoy playing!");

        while (playAgain) {
            totalRounds++;
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("\nRound " + totalRounds + ":");
            while (!guessedCorrectly) {
                System.out.print("Guess the number (between 1 and 100): ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You've guessed the number " + numberToGuess + " correctly in " + attempts + " attempts!");
                    guessedCorrectly = true;
                }
            }

            totalAttempts += attempts;
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            if (!playAgainInput.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("\nGame Over!\nTotal Rounds: " + totalRounds + "\nTotal Attempts: " + totalAttempts + "\nAverage Attempts per Round: " + (double) totalAttempts / totalRounds);
        scanner.close();
    }
    
}
