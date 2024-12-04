package com.jeido.exercises.exercise1;

import java.util.Map;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private static Map<String,String> configurations;

    private ConfigurationManager() {
        //TODO read from a file
        loadConfigurations(Map.of(
                "db.host", "localhost",
                "db.port", "5432",
                "app.name", "MyApplication"
        ));
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getConfiguration(String key) {
        return configurations.getOrDefault(key, "Key not found!");
    }

    public String listConfigurations() {
        return configurations.toString();
    }

    public void loadConfigurations(Map<String,String> config) {
        if (configurations == null) {
            configurations = config;
        }
    }
}
