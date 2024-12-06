package com.jeido.exercises.exercise6;

import com.jeido.exercises.exercise6.decorator.CheckeredToyDecorator;
import com.jeido.exercises.exercise6.decorator.StripeToyDecorator;
import com.jeido.exercises.exercise6.entity.Toy;
import com.jeido.exercises.exercise6.factory.TinToyFactory;
import com.jeido.exercises.exercise6.factory.ToyFactory;
import com.jeido.exercises.exercise6.factory.WoodToyFactory;
import com.jeido.exercises.exercise6.listener.ElfTinToyListener;
import com.jeido.exercises.exercise6.listener.ElfWoodToyListener;
import com.jeido.exercises.exercise6.listener.ToyListener;

public class Exercise6 {
    public static void start() {
        //Creating toys
        ToyFactory wf = new WoodToyFactory();
        ToyFactory tf = new TinToyFactory();

        Toy woodToy = wf.createToy();
        Toy tinToy = tf.createToy();

        //Creating elves
        ToyListener elfW = new ElfWoodToyListener("Elijah");
        ToyListener elfT = new ElfTinToyListener("Grooth");

        //event
        EventManager em = EventManager.getInstance();

        em.addListener(elfW);
        em.addListener(elfT);

        //action
        //build
        woodToy.build();
        tinToy.build();

        //paint
        woodToy.paint("Red");
        tinToy.paint("Blue");

        //decorate
        Toy decoratedWoodToy = new StripeToyDecorator(woodToy);
        decoratedWoodToy.paint("Red");
        Toy decoratedTinToy = new CheckeredToyDecorator(tinToy);
        decoratedTinToy.paint("Blue");
    }
}
