package ua.hillel.zirukin.lessons.lesson12;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class homework14 {
    public static void main(String[] args) {
        User user1 = new User("John", 1990, 5, 20, "john@gmail.com", "1234567890");
        User user2 = new User("Alice", 1985, 8, 15, "alice@gmail.com", "9876543210");

        User user3 = new User("Bob", 1995, 3, 10, "bob@gmail.com", "5555555555");
        user3.setSurname("Smith");
        user3.setWeight(75.5);
        user3.setBloodPressure("120/80");
        user3.setStepsPerDay(12000);

        User user4 = new User("Eva", 1980, 12, 3, "eva@gmail.com", "1112223333");
        user4.setWeight(68.2);
        user4.setBloodPressure("110/70");

        User user5 = new User("David", 2000, 6, 25, "david@gmail.com", "9998887777");
        user5.setStepsPerDay(8000);

        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();
        user4.printAccountInfo();
        user5.printAccountInfo();
    }
}

class User {
    private String name;
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private String email;
    private String phone;

    private String surname;
    private double weight;
    private String bloodPressure;
    private int stepsPerDay;
    private int age;

    public User(String name, int birthYear, int birthMonth, int birthDay, String email, String phone) {
        this.name = name;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.email = email;
        this.phone = phone;

        calculateAge();
    }

    private void calculateAge() {
        Calendar now = new GregorianCalendar();
        int currentYear = now.get(Calendar.YEAR);

        age = currentYear - birthYear;

        if (now.get(Calendar.MONTH) < birthMonth - 1 ||
                (now.get(Calendar.MONTH) == birthMonth - 1 && now.get(Calendar.DAY_OF_MONTH) < birthDay)) {
            age--;
        }
    }

    public void printAccountInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Surname: " + (surname != null ? surname : "N/A"));
        System.out.println("Weight: " + (weight != 0.0 ? weight : "N/A"));
        System.out.println("Blood Pressure: " + (bloodPressure != null ? bloodPressure : "N/A"));
        System.out.println("Steps Per Day: " + stepsPerDay);
        System.out.println();
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public void setStepsPerDay(int stepsPerDay) {
        this.stepsPerDay = stepsPerDay;
    }
}

