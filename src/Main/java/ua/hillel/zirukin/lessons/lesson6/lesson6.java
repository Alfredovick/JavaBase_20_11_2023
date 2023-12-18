package ua.hillel.zirukin.lessons.lesson6;

import java.util.Scanner;

public class lesson6 {
    public static void main(String[] args) {
//      int i = 0;
//      for ( ; ; ) {
//          System.out.println("Hello");
//          i++;
//          if (i == 4) {
//              break;
//          }
//      }
//
//        System.out.println(i);

//       for (int i = 0; i <= 20; i += 5) {
//           System.out.println(i);
//       }


//        for (int i = 0, j = 10; i < 10 && j > 5; i++, j--) {
//            System.out.println("i = " + i);
//            System.out.println("j = " + j);
//            System.out.println();
//        }

//        int counter = 0;
//        for (int i = 0; i < 5; i++) {
//            System.out.println("i = " + i);
//            for (int j = 0; j < 2; j++) {
//                System.out.println("j = " + j);


//            }

//        }

//        for (int i = 0; i < 20; i++) {
//            if ( i % 2 == 0) {
//                System.out.println(i);
//            }
//        }

//        for (int i = 0; i < 10; i+= 2) {
//
//            }

//        int num1 = 1;
//        int num2 = 1;
//        int sum = 0;
//        System.out.print(num1 + ", " + num2 + ", ");
//
//        for (int i = 0; i < 9; i++) {
//            sum = num1 + num2;
//            System.out.print(num1 + " ");
//            num1 = num2;
//            num2 = sum;
//        }

//        int i = 0;
//        while (i < 5) {
//            System.out.println("Hello");
//            i++;
//        }

        Scanner scanner = new Scanner(System.in);

//        while (true) {
//            System.out.println("Please enter integer from 10 to 20");
//            if (scanner.hasNext()) {
//                int userValue = scanner.nextInt();
//                boolean ok = userValue >= 10 & userValue <= 20;
//                System.out.println("user value = " + userValue);
//                break;
//            } else {
//                System.out.println("From 10 to 20!!!");
//                scanner.nextLine();
//            }
//        }

//        int i = 0;
//        while (i < 10) {
//            i++;
//
//            if (i == 5 || i == 7) {
//                continue;
//            }
//
//            System.out.println(i);
//
//            if (i == 8) {
//                break;
//            }
//        }

//        int i = 0;

//        do {
//            System.out.println("Hello");
//            i++;
//        } while (i < 2);

        int counter = 10;
        while (counter >= 0) {

            long randomNumber = Math.round(Math.random() * 101);

            if (randomNumber >= 85 && randomNumber <=100) {
                System.out.println("You survived, congratulation :)");
                break;
            }

            System.out.println(counter);

            counter--;
            if (counter == 0) {
                System.out.println("Boom! And you are death by blowing up!");
            }
        }
    }
}