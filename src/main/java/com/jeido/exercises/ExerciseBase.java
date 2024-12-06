package com.jeido.exercises;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public record ExerciseBase(int id, String title, Method method) {

    public void start() {
        try {
            method.invoke(null);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return id + ". " + title;
    }
}
