package com.jeido.exercises.exercise6.factory;

import com.jeido.exercises.exercise6.entity.TinToy;
import com.jeido.exercises.exercise6.entity.Toy;

public class TinToyFactory extends ToyFactory {
    @Override
    public Toy createToy() {
        return new TinToy();
    }
}
