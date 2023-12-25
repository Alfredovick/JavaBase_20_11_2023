package ua.hillel.zirukin.lessons.lesson8;

import java.util.Arrays;
import java.util.Random;

public class homeWork10 {
    public static void main(String[] args) {
        int[] lotteryNumbers = generateRandomNumbers(7);
        int[] guessedNumbers = generateRandomNumbers(7);

        Arrays.sort(lotteryNumbers);
        Arrays.sort(guessedNumbers);

        System.out.println(Arrays.toString(lotteryNumbers));
        System.out.println(Arrays.toString(guessedNumbers));

        int numberOfMatches = countMatches(lotteryNumbers, guessedNumbers);

        System.out.println("Number of matches: " + numberOfMatches);
    }

    public static int[] generateRandomNumbers(int size) {
        Random random = new Random();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(10);
        }

        return numbers;
    }

    public static int countMatches(int[] array1, int[] array2) {
        int count = 0;

        for (int i = 0; i < Math.min(array1.length, array2.length); i++) {
            if (array1[i] == array2[i]) {
                count++;
            }
        }

        return count;
    }
}
