package com.jeido.exercises.exercise3.listener;

public class ToFileListener implements com.jeido.exercises.exercise3.event.EventListener {

    private final String eventName;

    public ToFileListener(String eventName) {
        this.eventName = eventName;
    }

    @Override
    public void update(String message) {
        System.out.println(eventName + " got :'" + message + "'.");
    }
}
