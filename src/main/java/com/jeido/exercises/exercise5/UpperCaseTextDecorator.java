package com.jeido.exercises.exercise5;

public class UpperCaseTextDecorator extends TextDecorator {

    public UpperCaseTextDecorator(Text text) {
        super(text);
    }

    @Override
    public String transform() {
        return super.transform().toUpperCase();
    }
}
