package com.hillel.kravets.lessons.homework7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int randomnumber = (int) (Math.random() * 11);
        System.out.println("randomnumber = " + randomnumber);

        for (int i = 3; i > 0; i--) {
            System.out.println("Guess the number, you have " + i + " attempts");
            int number = getNumber(scanner);
            if (number == randomnumber) {
                System.out.println("Victory!");
                break;
            } else if (i == 1) {
                System.out.println("Loss");
            }
        }

        scanner.close();
    }

    static int getNumber(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int temp = scanner.nextInt();
                if (temp >= 0 && temp <= 10) {
                    return temp;
                } else {
                    System.out.println("Enter from 0 to 10");
                }
                scanner.nextLine();
            } else {
                System.out.println("Error, wrong meaning, try again");
                scanner.nextLine();
            }
        }
    }
}
