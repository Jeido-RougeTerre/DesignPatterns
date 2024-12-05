package com.jeido.exercises.exercise3.listener;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ToFileListener implements com.jeido.exercises.exercise3.event.EventListener {

    private final String fileName;

    public ToFileListener(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void update(String message) {

        String path = ("src/main/resources/exercises/exercise3/" + fileName).replace("/", File.separator);

        File file = new File(path);

        file.getParentFile().mkdirs();
        try {
            if (!file.createNewFile()) {
                file.delete();
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file, true);
            fw.write(message);
            fw.close();

            System.out.println(fileName + " = " + message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
