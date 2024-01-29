package ua.hillel.zirukin.lessons.lesson14;

interface Smartphones {
    void call();
    void sms();
    void internet();
}

interface LinuxOS {
    void runLinuxApp();
}

interface iOS {
    void useFaceID();
}

class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Android is making a call...");
    }

    @Override
    public void sms() {
        System.out.println("Android is sending a text message...");
    }

    @Override
    public void internet() {
        System.out.println("Android is browsing the internet...");
    }

    @Override
    public void runLinuxApp() {
        System.out.println("Android is running a Linux application...");
    }
}

class iPhones implements Smartphones, iOS {
    @Override
    public void call() {
        System.out.println("iPhone is making a call...");
    }

    @Override
    public void sms() {
        System.out.println("iPhone is sending a text message...");
    }

    @Override
    public void internet() {
        System.out.println("iPhone is browsing the internet...");
    }

    @Override
    public void useFaceID() {
        System.out.println("iPhone is using Face ID for authentication...");
    }
}

public class SmartphoneMain {
    public static void main(String[] args) {
        Androids androidPhone = new Androids();
        iPhones iPhone = new iPhones();

        androidPhone.call();
        androidPhone.sms();
        androidPhone.internet();

        iPhone.call();
        iPhone.sms();
        iPhone.internet();

        androidPhone.runLinuxApp();
        iPhone.useFaceID();
    }
}
