package com.jeido.exercises.exercise6;

import com.jeido.exercises.exercise6.listener.ToyListener;
import com.jeido.exercises.exercise6.entity.Toy;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private static EventManager instance;
    private List<ToyListener> events = new ArrayList<>();

    private EventManager() {}

    public static EventManager getInstance() {
        if (instance == null) {
            instance = new EventManager();
        }
        return instance;
    }

    public void addListener(ToyListener listener) {
        events.add(listener);
    }

    public void removeListener(ToyListener listener) {
        events.remove(listener);
    }

    public void build(Toy toy) {
        for (ToyListener listener : events) {
            listener.onBuild(toy);
        }
    }

    public void paint(Toy toy, String color) {
        for (ToyListener listener : events) {
            listener.onPaint(toy, color);
        }
    }
}
