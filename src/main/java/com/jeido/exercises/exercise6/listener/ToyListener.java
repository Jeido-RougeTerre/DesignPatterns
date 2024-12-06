package com.jeido.exercises.exercise6.listener;

import com.jeido.exercises.exercise6.entity.Toy;

public interface ToyListener {
    void onBuild(Toy toy);
    void onPaint(Toy toy, String paint);
}
