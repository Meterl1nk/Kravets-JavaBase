package com.hillel.kravets.lessons.homework15.abstracts;

public class RockMusic extends MusicStyles {

    @Override
    void playMusic() {
        System.out.println(str2 + name);
    }

    public RockMusic(String name) {
        super(name);
    }
}
