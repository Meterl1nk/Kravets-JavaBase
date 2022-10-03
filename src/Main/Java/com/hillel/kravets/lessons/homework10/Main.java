package com.hillel.kravets.lessons.homework10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int max = 9;
        final int count = 7;

        int[] lotteryorganizerArray = new int[count];
        int[] playerArray = new int[count];

        for (int i = 0; i < count; i++) {
            lotteryorganizerArray[i] = getRandomNumber(max);
            playerArray[i] = getRandomNumber(max);
        }

        System.out.println("Unsorted");
        System.out.println(Arrays.toString(lotteryorganizerArray));
        System.out.println(Arrays.toString(playerArray));
        Arrays.sort(lotteryorganizerArray);

        System.out.println("Sorted");
        System.out.println(Arrays.toString(lotteryorganizerArray));
        System.out.println(Arrays.toString(playerArray));
        Arrays.sort(playerArray);

        int counter = 0;
        for (int i = 0; i < count; i++) {
            if (lotteryorganizerArray[i] == playerArray[i]) {
                counter++;
            }
        }

        System.out.println();
        System.out.println("Total matches: " + counter);
    }

    static int getRandomNumber(int max) {
        return (int) (Math.random() * (max + 1));
    }
}
