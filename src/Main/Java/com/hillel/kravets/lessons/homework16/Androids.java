package com.hillel.kravets.lessons.homework16;

public class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Call from Android");
    }

    @Override
    public void message() {
        System.out.println("Message from Android");
    }

    @Override
    public void internet() {
        System.out.println("Android internet");
    }

    @Override
    public void takeLinuxOS() {
        System.out.println("LinuxOS ver.17.10");
    }
}
