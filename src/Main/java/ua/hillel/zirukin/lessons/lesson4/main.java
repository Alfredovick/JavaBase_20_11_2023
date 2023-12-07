package ua.hillel.zirukin.lessons.lesson4;

import javax.sound.midi.Soundbank;

import static java.lang.System.*;

public class main {
    public static void main(String[] args) {

//        System.out.println(10 + 5);
//        System.out.println(10 - 5);
//        System.out.println(10 * 5);
//        System.out.println(10 / 5);
//        System.out.println();
//
//        int a = 15;
//        int b = 5;
//
//        System.out.println(a + b);
//        System.out.println(a - b);
//        System.out.println(a * b);
//        System.out.println(a / b);


//        System.out.println(10 / 3);
//        System.out.println(10.0 / 3);
//        System.out.println(10 / 3.0);
//        System.out.println(10.0 / 3.0);
//        System.out.println(10D / 3);
//        System.out.println(10 / 3D);
//
//        System.out.println((double) 10 / 3);
//        System.out.println(10 / (double)3);
//
//        System.out.println((double) a / b);%
//        System.out.println(a / (double) b);


//        System.out.println(10 % 3); //3*3 = 9;  10 - 9 = 1
//        System.out.println(10 % 4); //4*2 = 8;  10 - 8 = 2
//        System.out.println(10 % 2); //2*5 = 10;  10 - 10 = 0


//        System.out.println(10 % 1); // 0
//        System.out.println(10 % 2); // 0  10 / 2 = 5. 10 - 10 = 0
//        System.out.println(10 % 3); // 1
//        System.out.println(10 % 4); // 2
//        System.out.println(10 % 5); // 0
//        System.out.println(10 % 6); // 4
//        System.out.println(10 % 7); // 3
//        System.out.println(10 % 8); // 2
//        System.out.println(10 % 9); // 1
//        System.out.println(10 % 10); // 0


//        System.out.println(121231233 % 2);
//        System.out.println(124 % 2);
//        System.out.println(125 % 2);
//        System.out.println(126 % 2);



//        int a = 10;
//        int b = 3;

//        a = a + b;
//        System.out.println(a);


//        a += b;
//        a -= b;
//        a *= b ;
//        a /= b;
//        a %= b;
//        System.out.println(a);


//        int a = 10;

//        a = a + 1;
//        a += 1;

//        a++;

//        System.out.println(a++);
//        System.out.println(a);

//        int a = 5;
//        int b = 2;
//
//        int result = ++a + --a - b++ + a++;
//
//        System.out.println("result = " + result);
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);


////        Дано: зарплати трьох працівників за 1 місяць (a, b, c)
////        Розрахувати:
////        1. для кожного працівника суму зарплати за 10 років
////        2. відняти 5% податок
////        3. порахувати середнє арифметичне за трьома сумами за 10 років
////        4. вивести суми зарплат за 10 років з урахуванням вирахування податків та
////        середнє арифм.
//        int a = 700;
//        int b = 2000;
//        int c = 3500;
//        int countMonthYears = 12 * 10;
//
//        int salary1 = a * countMonthYears;
//        int salary2 = b * countMonthYears;
//        int salary3 = c * countMonthYears;
//        System.out.println("salary1 = " + salary1);
//        System.out.println("salary2 = " + salary2);
//        System.out.println("salary3 = " + salary3);
//
//        double tax = 1 - 0.05;
//        double salary1WithoutTax = salary1 * tax;
//        double salary2WithoutTax = salary2 * tax;
//        double salary3WithoutTax = salary3 * tax;
//        System.out.println("salary1WithoutTax = " + salary1WithoutTax);
//        System.out.println("salary2WithoutTax = " + salary2WithoutTax);
//        System.out.println("salary3WithoutTax = " + salary3WithoutTax);
//
//        double sumSalary = salary1WithoutTax + salary2WithoutTax + salary3WithoutTax;
//        double avgSalary = sumSalary / 3;
//        System.out.println("sumSalary = " + sumSalary);
//        System.out.println("avgSalary = " + avgSalary);


//        System.out.println(Math.PI);
//        System.out.println(Math.E);

//        System.out.println(Math.abs(10));
//        System.out.println(Math.abs(-10));

//        System.out.println(Math.pow(2, 3));
//        System.out.println(Math.pow(2, 4));
//        System.out.println(Math.pow(2.2, 4.4));


//        System.out.println(Math.sqrt(9));
//        System.out.println(Math.sqrt(16));
//        System.out.println(Math.sqrt(16.5));


//        System.out.println(Math.round(10.19));
//        System.out.println(Math.round(10.49999));
//        System.out.println(Math.round(10.5));
//        System.out.println(Math.round(10.99));


//        System.out.println(Math.min(1, 2));
//        System.out.println(Math.min(3, 1));
//        System.out.println(Math.min(11, 22));
//
//        System.out.println(Math.max(1, 2));
//        System.out.println(Math.max(3, 1));
//        System.out.println(Math.max(11, 22));


//        System.out.println(Math.random()); // 0.0 - 0.99999999999999999999

//        System.out.println(Math.round(Math.random() * 10)); //[0 - 10]
//        System.out.println((int) (Math.random() * 11)); //0.9999 -> 9


        // [15 - 35]
//        System.out.println(15 + (int) (Math.random() * 21)); // 0.9999 * 21 -> 20.9999


        int min = 15;
        int max = 35;
        System.out.println((int) (Math.random() * (max - min + 1) + min));
        System.out.println(Math.round(Math.random() * (max - min) + min));
    }
}