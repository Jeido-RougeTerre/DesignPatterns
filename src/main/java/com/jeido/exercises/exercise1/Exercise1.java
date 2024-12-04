package com.jeido.exercises.exercise1;

public class Exercise1 {
    public static void start() {
        System.out.println("Instantiating ConfigurationManager...");
        ConfigurationManager cm = ConfigurationManager.getInstance();

        System.out.println("getting all configurations : " + cm.listConfigurations());

        System.out.println("getting key 'db.host' : " + cm.getConfiguration("db.host"));
    }
}
