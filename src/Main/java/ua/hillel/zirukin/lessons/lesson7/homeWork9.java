package ua.hillel.zirukin.lessons.lesson7;

import java.util.Random;

public class homeWork9 {
    public static void main(String[] args) {
        int playersCount = 25;
        int[] team1Ages = generateRandomAges(playersCount);
        int[] team2Ages = generateRandomAges(playersCount);

        System.out.println("Age of players in Team 1:");
        printAges(team1Ages);

        System.out.println("\nAge of players in Team 2:");
        printAges(team2Ages);

        int averageAgeTeam1 = calculateAverageAge(team1Ages);
        int averageAgeTeam2 = calculateAverageAge(team2Ages);

        System.out.println("\nAverage age of Team 1: " + averageAgeTeam1 + " years");
        System.out.println("Average age of Team 2: " + averageAgeTeam2 + " years");
    }

    public static int[] generateRandomAges(int count) {
        Random random = new Random();
        int[] ages = new int[count];

        for (int i = 0; i < count; i++) {
            ages[i] = random.nextInt(23) + 18;
        }

        return ages;
    }

    public static void printAges(int[] ages) {
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }

    public static int calculateAverageAge(int[] ages) {
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        return sum / ages.length;
    }
}