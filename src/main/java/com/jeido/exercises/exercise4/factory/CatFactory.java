package com.jeido.exercises.exercise4.factory;

import com.jeido.exercises.exercise4.entity.Animal;
import com.jeido.exercises.exercise4.entity.Cat;

public class CatFactory extends AnimalFactory {

    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
