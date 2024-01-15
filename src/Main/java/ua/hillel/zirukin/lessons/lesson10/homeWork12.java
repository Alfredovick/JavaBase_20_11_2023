package ua.hillel.zirukin.lessons.lesson10;

public class homeWork12 {
    public static void main(String[] args) {
        System.out.println(personInfo("Will", "Smith", "New York", "2936729462846"));
        System.out.println(personInfo("Jackie", "Chan", "Shanghai", "12312412412"));
        System.out.println(personInfo("Sherlock", "Holmes", "London", "37742123513"));
    }

    public static String personInfo(String firstName, String lastName, String city, String phoneNumber) {
        return "Зателефонувати громадянинові " + firstName + " " + lastName + " з міста " + city +
                " можна за номером " + phoneNumber + ".";
    }
}
