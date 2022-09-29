package com.hillel.kravets.lessons.homework15.abstracts;

public class ClassicMusic extends MusicStyles {

    String name;

    public ClassicMusic(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    void playMusic() {
        System.out.println("Ludwig Van Beethoven - Symphony No. 5");
    }
}
