package com.jeido.exercises;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        //TODO automatic fetcher
    }

    public static List<ExerciseBase> getExercises() {
        return exercises.values().stream().toList();
    }

    public static void start(int number) {
        if (exercises.containsKey(number)) {
            exercises.get(number).start();
        }
    }
}
