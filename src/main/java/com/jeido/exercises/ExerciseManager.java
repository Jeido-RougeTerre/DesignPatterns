package com.jeido.exercises;

import java.io.File;
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
        String path = ("src.main.java." + ExerciseBase.class.getPackage().getName()).replace(".", File.separator);
        File file = new File(path);
        List<String> dirs = Arrays.stream(Objects.requireNonNull(file.list())).filter(s -> s.matches("^exercise[0-9]+$")).toList();
        dirs.forEach(dir -> {
            File f = new File(path + File.separator + dir);
            if(f.exists() && f.isDirectory()) {
                List<String> contents = Arrays.asList(Objects.requireNonNull(f.list()));
                contents.stream().filter(c -> c.matches("^Exercise[0-9]+[.]java+$")).forEach(System.out::println);
            }
        });
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
