package com.jeido.ui;

import com.jeido.exercises.ExerciseBase;
import com.jeido.exercises.ExerciseManager;

import java.util.Scanner;

public class ConsoleLogger {
    private static ConsoleLogger instance;
    private final ExerciseManager exerciseManager;
    private final Scanner scanner;

    private ConsoleLogger() {
        exerciseManager = ExerciseManager.getInstance();
        scanner = new Scanner(System.in);
    }

    public static ConsoleLogger getInstance() {
        if (instance == null) {
            instance = new ConsoleLogger();
        }
        return instance;
    }

    public void menu() {
        while (true) {
            StringBuilder sb = new StringBuilder();
            sb.append("== Choose an Exercise ==\n");
            for (ExerciseBase exercise : exerciseManager.getExercises()) {
                sb.append(exercise.getNumber()).append(". ").append(exercise).append("\n");
            }
            sb.append("0. Quit\n> ");
            System.out.print(sb);

            String input = scanner.nextLine();
            try {
                int choice = Integer.parseInt(input);
                if (choice == 0) {
                    scanner.close();
                    System.out.println("Goodbye");
                    return;
                }

                if (exerciseManager.getExerciseNumbers().contains(choice)) {
                    exerciseManager.start(choice);
                } else {
                    System.out.println("Invalid exercise number");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid exercise number");
            }
        }
    }
}
