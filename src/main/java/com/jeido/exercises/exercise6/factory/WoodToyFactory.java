package com.jeido.exercises.exercise6.factory;

import com.jeido.exercises.exercise6.entity.Toy;
import com.jeido.exercises.exercise6.entity.WoodToy;

public class WoodToyFactory extends ToyFactory {
    @Override
    public Toy createToy() {
        return new WoodToy();
    }
}
