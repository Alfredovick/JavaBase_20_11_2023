package ua.hillel.zirukin.lessons.lesson11;

public class burgerMain {
    public static void main(String[] args) {
        burger regularBurger = new burger();
        burger dietBurger = new burger(true);
        burger doubleMeatBurger = new burger(2);
    }
}
