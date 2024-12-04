package com.jeido.exercises.exercise1;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise1 {
    public static void start() {
        System.out.println("Instantiating ConfigurationManager...");
        ConfigurationManager cm = ConfigurationManager.getInstance();


        Map<String, String> config = new HashMap<>();
        String file = "src/main/resources/exercises/exercise1/config";
        try (Scanner scanner = new Scanner(new File(file))) {
            scanner.useDelimiter("\\Z");
            while (scanner.hasNext()) {
                String line = scanner.next();
                String key = line.split(":")[0];
                String value = line.split(":")[1];
                config.put(key, value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        cm.loadConfigurations(config);
        System.out.println("getting all configurations : " + cm.listConfigurations());

        System.out.println("getting key 'db.host' : " + cm.getConfiguration("db.host"));
    }
}
