package com.jeido.exercises.exercise9;

public class RemoveSongCommand implements Command {
    private Song song;

    public RemoveSongCommand(String title, String artist) {
        this.song = new Song(title, artist);
    }

    public RemoveSongCommand(Song song) {
        this.song = song;
    }

    public Song getSong() {
        return song;
    }

    @Override
    public void execute() {
        if (song == null) {
            System.out.println("Song is null");
            return;
        }

        System.out.println("Removed song: " + song);
    }
}

