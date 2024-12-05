package com.jeido;


import com.jeido.exercises.ExerciseBase;
import com.jeido.ui.ConsoleLogger;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String p = ExerciseBase.class.getPackage().getName();
        List<String> packagesNames = Arrays.stream(Package.getPackages()).map(Package::getName)
                .filter(s -> s.startsWith(p)).toList();
        packagesNames.forEach(System.out::println);
        ConsoleLogger menu = ConsoleLogger.getInstance();
        menu.menu();
    }
}
