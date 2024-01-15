package ua.hillel.zirukin.lessons.lesson10;

import java.util.Arrays;

public class lesson10 {

    public static void main(String[] args) {

//        printHelloWorld();
//        String den = "Den";
//        printHelloName(den);
//        printHelloName("Alex");
//
//        int x = 10;
//        System.out.println("from main " + x);
//        demo(x);
//        System.out.println("from main after demo " + x);

//        manyArgs(15, 5.5, 555555555l, "qweqweqw", new int[]{1,2,3});


//        int number = returnRandomIntValue();
//        System.out.println(number);
//
//        System.out.println(returnRandomIntValue());
//
//        demo(returnRandomIntValue());


//        int sum = sum(1, 2, 3);
//        System.out.println(sum);

//        demoReturnVoidMethod(2);

//        demoReturnMethod(1);

//        demoVarArgs(1);
//        demoVarArgs(1, 2, 3);
//        demoVarArgs();
//        demoVarArgs(1, 2, 3, 4, 5, 6, 7, 8, 9);

//        demoVarArgs2(1, 2, 4, 4, 4, 4, 4);


//        int[] array = new int[]{5, 5, 5, 5, 5, 5};
//
//        demoVarArgs(1, 2, 3);
//        demoVarArgs(new int[]{1, 2, 3, 4, 5});
//        demoVarArgs(array);


//        int[] values = new int[] {1, 2, 3};
//        getValue(values);
//        System.out.println(Arrays.toString(values));


//        demoRecursion();


//        5! = 1 * 2 * 3 * 4 * 5;
//        3! = 1 * 2 * 3;

//        int factorial = 1;
//        for (int i = 1; i <= 5; i++) {
//            factorial *= i;
//        }
//
//        System.out.println(factorial);

//        System.out.println(getFactorial(5));

        System.out.println(evclide(12, 18));

        String str = "0934445544";
    }


    static int evclide(int n, int m) {
        if (n == m) {
            return n;
        } else if (n > m) {
            return evclide(n - m, m);
        } else {
            return evclide(n, m - n);
        }
    }

    static int getFactorial(int number) {
        if (number == 1) {
            return 1;
        }
        return number * getFactorial(number - 1);
    }


    // BAD RECURSION!!!!!!!!!!!!!!!
    static void demoRecursion() {
        demoRecursion();
    }


    static void getValue(int[] values) {
        values[0] = 55;
    }


    static void demoVarArgs2(int x1, int x2, int... numbers) {
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(Arrays.toString(numbers));
    }

    static void demoVarArgs(int... numbers) {
        System.out.println(Arrays.toString(numbers));
    }


    static int demoReturnMethod(int x) {
        if (x == 2) {
            return 2;
        } else if (x == 3) {
            return 3;
        } else {
            return 999;
        }
    }

    static void demoReturnVoidMethod(int x) {
        if (x == 2) {
            return;
        }
        if (x == 3) {
            return;
        }

        System.out.println("sdfwefwesfrew");

    }


    static double sum(int num1, int num2, double num3) {
        return num1 + num2 + num3;
    }

    static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    static int sum(int num1, int num2) {
//        int sum = num1 + num2;
//        return sum;

        return num1 + num2;
    }

    static int returnRandomIntValue() {
        int randomValue = (int) (Math.random() * 11);
        return randomValue;
    }


    static void manyArgs(int x, double y, long k, String str, int[] arr) {

    }


    static void demo(int x) {
        System.out.println("from demo " + x);
    }

    static void demo2() {
        int x = 12;
        System.out.println(x);
    }


    static void printHelloWorld2() {
        System.out.println("Hello World2!!!");
    }

    static void printHelloWorld() {
        System.out.println("Hello World!!!");
    }

    static void printHelloName(String name) {
        System.out.println("Hello " + name);
    }


}