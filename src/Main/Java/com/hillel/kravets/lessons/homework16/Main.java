package com.hillel.kravets.lessons.homework16;

public class Main {
    public static void main(String[] args) {

        Androids android = new Androids();

        android.call();
        android.message();
        android.internet();
        android.takeLinuxOS();

        System.out.println();
        System.out.println();

        Iphones iphone = new Iphones();

        iphone.call();
        iphone.message();
        iphone.internet();
        iphone.takeIOS();
    }
}
