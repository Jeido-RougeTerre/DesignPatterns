package com.jeido.exercises.exercise1;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private static final Map<String,String> CONFIGURATIONS = new HashMap<>();

    private ConfigurationManager() {
        //TODO read from a file
        CONFIGURATIONS.put("db.host", "localhost");
        CONFIGURATIONS.put("db.port", "5432");
        CONFIGURATIONS.put("app.name", "MyApplication");
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getConfiguration(String key) {
        return CONFIGURATIONS.get(key);
    }
    
    public String listConfigurations() {
        return CONFIGURATIONS.toString();
    }
}
