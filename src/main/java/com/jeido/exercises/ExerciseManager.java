package com.jeido.exercises;

import java.io.IOException;
import java.util.*;

public class ExerciseManager {
    private static ExerciseManager instance;
    private static Map<Integer, ExerciseBase> exercises;

    public static ExerciseManager getInstance() {
        if (instance == null) {
            instance = new ExerciseManager();
        }
        return instance;
    }

    private ExerciseManager() {
        exercises = new HashMap<>();
        Package.getPackages();
    }

    public List<ExerciseBase> getExercises() {
        return exercises.values().stream().toList();
    }

    public List<Integer> getExerciseNumbers() {return exercises.keySet().stream().toList();}

    public void start(int number) {
        if (exercises.containsKey(number)) {
            exercises.get(number).start();
        }
    }

    public void addExercise(ExerciseBase exercise) {
        if (exercises.containsKey(exercise.getNumber())) return;

        exercises.put(exercise.getNumber(), exercise);
    }


}
