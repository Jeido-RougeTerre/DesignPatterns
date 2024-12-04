package com.jeido.exercises.exercise1;

import java.util.Map;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private static Map<String,String> configurations;

    private ConfigurationManager() {}

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
