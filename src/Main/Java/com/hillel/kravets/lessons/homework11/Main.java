package com.hillel.kravets.lessons.homework11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int m = matrix(scanner);
        int n = matrix(scanner);

        int[][] firstArray = new int[m][n];
        int[][] secondArray = new int[n][m];

        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray[i].length; j++) {
                firstArray[i][j] = (int) (Math.random() * 101);
            }
        }
        System.out.println("First array:");
        printArray(firstArray);

        for (int i = 0; i < secondArray.length; i++) {
            for (int j = 0; j < secondArray[i].length; j++) {
                secondArray[i][j] = firstArray[j][i];
            }
        }
        System.out.println("Second array:");
        printArray(secondArray);
        scanner.close();
    }

    static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static int matrix(Scanner scanner) {
        int temp = 0;
        System.out.println("Enter array length");
        while (true) {
            if (scanner.hasNextInt()) {
                temp = scanner.nextInt();
                if (temp < 0) {
                    System.out.println("Enter positive number");
                } else {
                    break;
                }
                scanner.nextLine();
            } else {
                System.out.println("Error, wrong meaning, try again");
                scanner.nextLine();
            }
        }
        return temp;
    }
}
