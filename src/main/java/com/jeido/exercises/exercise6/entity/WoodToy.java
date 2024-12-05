package com.jeido.exercises.exercise6.entity;

import com.jeido.exercises.exercise6.EventManager;

public class WoodToy implements Toy {

    EventManager em = EventManager.getInstance();

    @Override
    public void build() {
        em.build(this);
    }

    @Override
    public void paint(String color) {
        em.paint(this, color);
    }
}
