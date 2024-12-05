package com.jeido.exercises.exercise3.listener;

import com.jeido.exercises.exercise3.event.EventListener;

public class ToJsonListener implements EventListener {
    private final String fileName;

    public ToJsonListener(String fileName) {
        this.fileName = fileName;
    }


    @Override
    public void update(String message) {
        System.out.println(fileName + ".json = {\n\"message\":\"" + message + "\"\n}");
    }
}
