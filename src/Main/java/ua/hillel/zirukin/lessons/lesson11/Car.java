package ua.hillel.zirukin.lessons.lesson11;

import java.sql.SQLOutput;

public class Car {

    String modelName;
    int year;

    void start() {
        System.out.println(modelName + " start...");
    }

    void stop() {
        System.out.println(modelName + " stop...");
    }

    void run () {
        System.out.println(modelName + " run...");
    }

//    void demo() {
//        String modelName = "Wunderfaffe";
//        int year = 28;
//
//        System.out.println(modelName);
//    }
//
//    void demo2() {
//        System.out.println(modelName);
//        System.out.println(year);
//    }
}
