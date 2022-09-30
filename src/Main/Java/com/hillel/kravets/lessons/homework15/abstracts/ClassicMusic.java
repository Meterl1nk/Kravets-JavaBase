package com.hillel.kravets.lessons.homework15.abstracts;

public class ClassicMusic extends MusicStyles {


    @Override
    void playMusic() {
        System.out.println(str3 + name);
    }

    public ClassicMusic(String name) {
        super(name);}
}
