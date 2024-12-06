package com.jeido.exercises.exercise6.decorator;

import com.jeido.exercises.exercise6.entity.Toy;

public class CheckeredToyDecorator extends ToyDecorator {
    public CheckeredToyDecorator(Toy toy) {
        super(toy);
    }

    @Override
    public void build() {
    }

    @Override
    public void paint(String color) {
        super.paint("Checkered " + color);
    }
}
