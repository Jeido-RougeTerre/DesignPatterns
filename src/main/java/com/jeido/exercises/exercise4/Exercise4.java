package com.jeido.exercises.exercise4;

import com.jeido.exercises.exercise4.factory.CatFactory;
import com.jeido.exercises.exercise4.factory.DogFactory;

public class Exercise4 {
    public static void start() {
        DogFactory df = new DogFactory();
        System.out.println(df.createAnimal().makeSound());
        CatFactory cf = new CatFactory();
        System.out.println(cf.createAnimal().makeSound());
    }
}
