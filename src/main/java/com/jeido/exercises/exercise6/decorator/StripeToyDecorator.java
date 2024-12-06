package com.jeido.exercises.exercise6.decorator;

import com.jeido.exercises.exercise6.entity.Toy;

public class StripeToyDecorator extends ToyDecorator {

    public StripeToyDecorator(Toy toy) {
        super(toy);
    }


    @Override
    public void build() {

    }

    @Override
    public void paint(String color) {
        super.paint("Stripped " + color);
    }
}
