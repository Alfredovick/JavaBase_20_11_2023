package ua.hillel.zirukin.lessons.lesson5;

import java.util.Scanner;

public class homeWork6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Counter-Terrorist ");
        String teamName1 = scanner.nextLine();
        int[] frags1 = new int[5];

        System.out.println("10, 14, 3, 5, 3");
        for (int i = 0; i < 5; i++) {
            System.out.print("Alpha, Beta, Delta, Gamma, Epsilon " + (i + 1) + ": ");
            frags1[i] = scanner.nextInt();
        }

        double average1 = calculateAverage(frags1);

        scanner.nextLine();
        System.out.print("Terrorist ");
        String teamName2 = scanner.nextLine();
        int[] frags2 = new int[5];

        System.out.println("4, 20, 10, 1, 8");
        for (int i = 0; i < 5; i++) {
            System.out.print("Lone, Sigma, Loren, Alfa, Tap " + (i + 1) + ": ");
            frags2[i] = scanner.nextInt();
        }

        double average2 = calculateAverage(frags2);

        String winner;
        if (average1 > average2) {
            winner = teamName1;
        } else if (average1 < average2) {
            winner = teamName2;
        } else {
            winner = "Tie";
        }

        System.out.println("The winner is team " + winner + ". They scored " + (winner.equals(teamName1) ? average1 : average2) + " points");
    }

    private static double calculateAverage(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return (double) sum / array.length;
    }
}
