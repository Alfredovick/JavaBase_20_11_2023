package ua.hillel.zirukin.lessons.lesson6;

import java.util.Random;
import java.util.Scanner;

public class homeWork7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 0;
        int upperBound = 10;
        int numberToGuess = random.nextInt(upperBound + 1); // Generating a random number between 0 and 10 inclusive
        int attemptsLeft = 3;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the number between " + lowerBound + " and " + upperBound);

        while (attemptsLeft > 0) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();

            if (userGuess == numberToGuess) {
                System.out.println("Congratulations! You guessed the correct number.");
                break;
            } else {
                attemptsLeft--;
                if (attemptsLeft > 0) {
                    System.out.println("Incorrect! Try again. Attempts left: " + attemptsLeft);
                } else {
                    System.out.println("Sorry, you've run out of attempts. The correct number was: " + numberToGuess);
                }
            }
        }

        scanner.close();
    }
}
