package com.hillel.kravets.lessons.homework15.abstracts;

public class Main {
    public static void main(String[] args) {

        MusicStyles PopMusic = new PopMusic("Michael Jackson - Billie Jean");
        MusicStyles RockMusic = new RockMusic("Rammstein - Sonne");
        MusicStyles ClassicMusic = new ClassicMusic("Ludwig Van Beethoven - Symphony No. 5");

        PopMusic.playMusic();
        RockMusic.playMusic();
        ClassicMusic.playMusic();

    }
}
