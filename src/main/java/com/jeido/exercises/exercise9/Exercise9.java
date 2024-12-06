package com.jeido.exercises.exercise9;

public class Exercise9 {
    public static void start() {
        Song darude = new Song("Darude Song", "Darude Song");
        Command addDarude = new AddSongCommand(darude);
        Command remDarude = new RemoveSongCommand(darude);

        Playlist playlist = new Playlist();

        playlist.set(addDarude);
        playlist.pressButton();

        playlist.set(new AddSongCommand("never gonna give you up", "rick astley"));
        playlist.pressButton();

        playlist.set(remDarude);
        playlist.pressButton();
    }
}
