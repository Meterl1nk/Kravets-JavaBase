package com.hillel.kravets.lessons.homework6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nameforteam1;
        String nameforteam2;

        double totalFragsTeam1 = 0;
        double totalFragsTeam2 = 0;

        double averageFragsTeam1 = 0;
        double averageFragsTeam2 = 0;

        final int amount_players = 5;
        int[] team1 = new int[amount_players];
        int[] team2 = new int[amount_players];


        System.out.println("Enter a name for the first team: ");
        nameforteam1 = scanner.nextLine();

        System.out.println("Enter a name for the second team: ");
        nameforteam2 = scanner.nextLine();

        for (int i = 0; i < team1.length; i++) {
            System.out.println("Enter frags for player " + (i + 1) + " team " + nameforteam1);
            team1[i] = getFrags(scanner);
            totalFragsTeam1 += team1[i];
        }

        for (int i = 0; i < team2.length; i++) {
            System.out.println("Enter frags for player " + (i + 1) + " team " + nameforteam2);
            team2[i] = getFrags(scanner);
            totalFragsTeam2 += team2[i];
        }

        System.out.println("total frags team " + nameforteam1 + ": " + totalFragsTeam1);
        System.out.println("total frags team " + nameforteam2 + ": " + totalFragsTeam2);

        averageFragsTeam1 = totalFragsTeam1 / amount_players;
        averageFragsTeam2 = totalFragsTeam2 / amount_players;

        System.out.println("average frags team " + nameforteam1 + ": " + averageFragsTeam1);
        System.out.println("average frags team " + nameforteam2 + ": " + averageFragsTeam2);

        if (averageFragsTeam1 == averageFragsTeam2) {
            System.out.println("Draw");
        } else if (averageFragsTeam1 > averageFragsTeam2) {
            System.out.println("Team " + nameforteam1 + " won");
        } else {
            System.out.println("Team " + nameforteam2 + " won");
        }

        scanner.close();
    }

    static int getFrags(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int temp = scanner.nextInt();
                if (temp >= 0) {
                    return temp;
                } else {
                    System.out.println("Enter positive number");
                }
                scanner.nextLine();
            } else {
                System.out.println("Error, wrong meaning, try again");
                scanner.nextLine();
            }
        }
    }
}
