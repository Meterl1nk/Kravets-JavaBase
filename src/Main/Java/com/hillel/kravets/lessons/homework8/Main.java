package com.hillel.kravets.lessons.homework8;

public class Main {
    public static void main(String[] args) {

        int counter = 0;
        for (int i = 1; counter < 100 ; i++) {
            if (shuttleNumbers(i)) {
                System.out.println("number: " + i);
                counter++;
            }
        }
        System.out.println("count shuttle: " + counter);
    }

    static boolean shuttleNumbers(int number) {
        String str = String.valueOf(number);
        return !(str.contains("4") || str.contains("9"));
    }

}


