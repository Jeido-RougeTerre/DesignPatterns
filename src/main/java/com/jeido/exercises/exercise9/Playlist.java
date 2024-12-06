package com.jeido.exercises.exercise9;

public class Playlist {
    private Command command;

    public void set(Command command) {
        this.command = command;
    }

    public void pressButton() {
        if (command == null) {
            System.out.println("no command");
            return;
        }
        command.execute();
    }
}
