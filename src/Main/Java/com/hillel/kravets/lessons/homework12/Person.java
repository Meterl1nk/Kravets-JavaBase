package com.hillel.kravets.lessons.homework12;

public class Person {
    public static void main(String[] args) {

        String PresidentofUkraine = personInfo("Volodymyr", "Zelensky", "Kyiv", "+380442557333");
        System.out.println(PresidentofUkraine);

        String ExPrimeMinisterofGreatBritain = personInfo("Boris", "Johnson", "London", "+4402072194682");
        System.out.println(ExPrimeMinisterofGreatBritain);

        String PresidentofUSA = personInfo("Joe", "Biden", "Washington", "+12024562673");
        System.out.println(PresidentofUSA);
    }

    static String personInfo(String name, String surname, String city, String phoneNumber) {
        return "You can call the citizens of " + name + " " + surname + " from the city of " + city + " at the number " + phoneNumber;
    }
}
