package com.hillel.kravets.lessons.homework9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int min = 18;
        int max = 40;
        final int CountPlayers = 25;

        int[] team1 = new int[CountPlayers];
        int[] team2 = new int[CountPlayers];

        double TotalYearsOldTeam1 = 0;
        double TotalYearsOldTeam2 = 0;

        double AverageYearsOldTeam1 = 0;
        double AverageYearsOldTeam2 = 0;

        for (int i = 0; i < CountPlayers; i++) {
            team1[i] = getRandomNumber(min, max);
            TotalYearsOldTeam1 += team1[i];
            team2[i] = getRandomNumber(min, max);
            TotalYearsOldTeam2 += team2[i];
        }

        AverageYearsOldTeam1 = TotalYearsOldTeam1 / CountPlayers;
        AverageYearsOldTeam2 = TotalYearsOldTeam2 / CountPlayers;

        System.out.println("Team1: " + Arrays.toString(team1));
        System.out.println("Team2: " + Arrays.toString(team2));
        System.out.println("Average Team1: " + AverageYearsOldTeam1);
        System.out.println("Average team2: " + AverageYearsOldTeam2);
    }

    static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}