package com.hillel.kravets.lessons.homework15.abstracts;

public class Main {
    public static void main(String[] args) {

        MusicStyles[] musics = {

        new PopMusic("Michael Jackson - Billie Jean"),
        new RockMusic("Rammsten - Sonne"),
        new ClassicMusic("Ludwig Van Beethoven - Symphony No. 5")
        };

        for (MusicStyles music : musics) {
            music.playMusic();
        }
    }
}
