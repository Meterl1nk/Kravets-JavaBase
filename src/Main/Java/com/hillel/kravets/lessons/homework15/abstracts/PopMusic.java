package com.hillel.kravets.lessons.homework15.abstracts;

public class PopMusic extends MusicStyles {


    @Override
    void playMusic() {
        System.out.println(str1 + name);
    }

    public PopMusic(String name) {
        super(name);
    }
}
