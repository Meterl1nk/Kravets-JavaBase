package com.hillel.kravets.lessons.homework15.abstracts;

public abstract class MusicStyles {

   abstract void playMusic();

   protected String name;

    public MusicStyles(String name) {
        this.name = name;
    }

    String str1 = ("Pop music playing: ");
    String str2 = ("Rock music playing: ");
    String str3 = ("Classic music playing: ");

}
