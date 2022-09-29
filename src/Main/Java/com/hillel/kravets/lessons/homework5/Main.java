package com.hillel.kravets.lessons.homework5;

public class Main {
    public static void main(String[] args) {

        int warrior1 = 13;
        int archer1 = 24;
        int cavalryman1 = 46;
        double Lee = (warrior1 + archer1 + cavalryman1) * 860;

        int warrior2 = 9;
        int archer2 = 35;
        int cavalryman2 = 12;
        double Min = ((warrior2 + archer2 + cavalryman2) * 860) * 1.5;

        System.out.println("Army's attack Lee -" + " " + Lee);

        System.out.println("Army's attack Min -" + " " + Min);

        System.out.println("Army's total attack size Lee and Min -" + " " + (Lee + Min));

    }
}
