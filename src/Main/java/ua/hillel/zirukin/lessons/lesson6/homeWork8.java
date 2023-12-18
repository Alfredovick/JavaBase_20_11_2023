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

        String numberString = String.valueOf(number);
        return numberString.contains("4") || numberString.contains("9");
    }
}
