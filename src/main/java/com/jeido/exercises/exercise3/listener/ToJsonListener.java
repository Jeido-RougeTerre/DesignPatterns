package com.jeido.exercises.exercise3.listener;

import com.jeido.exercises.exercise3.event.EventListener;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ToJsonListener implements EventListener {
    private final String fileName;

    public ToJsonListener(String fileName) {
        this.fileName = fileName;
    }


    @Override
    public void update(String message) {
        String path = ("src/main/resources/exercises/exercise3/" + fileName + ".json").replace("/", File.separator);
        String content = "{\n\t\"message\":\"" + message + "\"\n}";
        File file = new File(path);

        file.getParentFile().mkdirs();
        try {
            if (!file.createNewFile()) {
                file.delete();
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file, true);
            fw.write(content);
            fw.close();

            System.out.println(fileName + " = " + content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
