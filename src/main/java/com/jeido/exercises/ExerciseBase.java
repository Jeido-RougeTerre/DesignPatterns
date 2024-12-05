package com.jeido.exercises;

public abstract class ExerciseBase {
    private String title;
    private int number;
    private ExerciseManager manager = ExerciseManager.getInstance();

    public ExerciseBase(String title, int number) {
        this.title = title;
        this.number = number;
        manager.addExercise(this);
    }

    public String getTitle() {
        return title;
    }

    public int getNumber() {
        return number;
    }

    public abstract void start();

    @Override
    public String toString() {
        return "Exercise " + number + ((title != null && !title.isEmpty() && !title.isBlank())? " : " + title : "") ;
    }
}
