package ua.hillel.zirukin.lessons.lesson6;

import java.util.ArrayList;
import java.util.List;

public class homeWork8 {
    public static void main(String[] args) {
        List<Integer> shuttleNumbers = generateShuttleNumbers(100);

        System.out.println("List of Shuttle Numbers:");
        for (int number : shuttleNumbers) {
            System.out.print(number + " ");
        }
    }

    public static List<Integer> generateShuttleNumbers(int numberOfShuttles) {
        List<Integer> shuttleNumbers = new ArrayList<>();
        int currentNumber = 1;

        while (shuttleNumbers.size() < numberOfShuttles) {
            if (!containsUnluckyNumber(currentNumber)) {
                shuttleNumbers.add(currentNumber);
            }
            currentNumber++;
        }

        return shuttleNumbers;
    }

    public static boolean containsUnluckyNumber(int number) {
        // Check if the number contains the digits 4 or 9 without using string contains
        while (number > 0) {
            int digit = number % 10;
            if (digit == 4 || digit == 9) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}
