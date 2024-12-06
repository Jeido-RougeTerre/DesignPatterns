package com.jeido.exercises.exercise9;

public class AddSongCommand implements Command {
    private Song song;

    public AddSongCommand(String title, String artist) {
        this.song = new Song(title, artist);
    }

    public AddSongCommand(Song song) {
        this.song = song;
    }

    @Override
    public void execute() {
        if (song == null) {
            System.out.println("Song is null");
            return;
        }

        System.out.println("added song: " + song);
    }
}
