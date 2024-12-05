package com.jeido.exercises.exercise3;

import com.jeido.exercises.exercise3.event.EventListener;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    public static List<EventListener> eventListeners = new ArrayList<>();


    public void addEventListener(EventListener e){
        eventListeners.add(e);
    }

    public void notifyAllEvents(String message){
        for(EventListener e : eventListeners){
            e.update(message);
        }
    }
}
