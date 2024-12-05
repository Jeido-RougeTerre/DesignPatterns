package com.jeido.exercises.exercise3.listener;

public class ToFileListener implements com.jeido.exercises.exercise3.event.EventListener {

    private final String fileName;

    public ToFileListener(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void update(String message) {
        System.out.println(fileName + " = " + message);
    }
}
