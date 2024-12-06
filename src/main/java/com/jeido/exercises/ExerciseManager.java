package com.jeido.exercises;

import java.io.File;
import java.util.*;

public class ExerciseManager {
    private static ExerciseManager instance;
    private final List<ExerciseBase> exercises;

    public static ExerciseManager getInstance() {
        if (instance == null) {
            instance = new ExerciseManager();
        }
        return instance;
    }

    private ExerciseManager() {
        exercises = new ArrayList<>();

        String p = ExerciseManager.class.getPackage().getName();

        //get the exercise packages count
        String path = ("src.main.java." + p).replace(".", File.separator);
        File file = new File(path);
        int count =  Arrays.stream(Objects.requireNonNull(file.list())).filter(s -> s.matches("^exercise[0-9]+$")).toList().size();

        for (int i = 1; i <= count; i++) {
            try {
                Class<?> exerciseClass = Class.forName( p +  ".exercise" + i + ".Exercise" + i);
                exercises.add(new ExerciseBase(i, "Exercise " + i, exerciseClass.getDeclaredMethod("start")));


            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void start(int number) {
        if (number < 0 || number >= exercises.size()) return;
        try {
            exercises.get(number).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<ExerciseBase> getExercises() {
        return exercises;
    }
}
