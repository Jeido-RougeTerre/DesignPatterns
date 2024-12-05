package com.jeido.exercises.exercise5;

public class Exercise5 {
    public static void start() {
        Text lorem = new LoremIpsumDecorator();
        System.out.println(lorem.transform());

        Text upperCase = new UpperCaseTextDecorator(lorem);
        System.out.println(upperCase.transform());

        Text prefix = new PrefixTextDecorator(lorem);
        System.out.println(prefix.transform());

        Text upperCasePrefix = new PrefixTextDecorator(upperCase);
        System.out.println(upperCasePrefix.transform());
    }
}
