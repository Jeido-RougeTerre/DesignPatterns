package com.jeido.exercises.exercise5;

public class PrefixTextDecorator extends TextDecorator {
    public PrefixTextDecorator(Text text) {
        super(text);
    }

    @Override
    public String transform() {
        return "Prefix: " + super.transform();
    }
}
