package com.jeido.exercises.exercise6.decorator;

import com.jeido.exercises.exercise6.EventManager;
import com.jeido.exercises.exercise6.entity.Toy;

public abstract class ToyDecorator implements Toy {
    private EventManager em = EventManager.getInstance();
    protected Toy toy;
    public ToyDecorator(Toy toy) {
        this.toy = toy;
    }

    @Override
    public void paint(String color) {
        em.paint(toy, color);
    }
}
