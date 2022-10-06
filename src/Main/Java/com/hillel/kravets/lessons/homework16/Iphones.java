package com.hillel.kravets.lessons.homework16;

public class Iphones implements Smartphones, IOS {
    @Override
    public void call() {
        System.out.println("Call from Iphone");
    }

    @Override
    public void message() {
        System.out.println("Message from Iphone");
    }

    @Override
    public void internet() {
        System.out.println("Iphone internet");
    }

    @Override
    public void takeIOS() {
        System.out.println("IOS ver. 14");
    }
}
