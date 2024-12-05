package com.jeido.exercises.exercise3;

import com.jeido.exercises.exercise3.event.EventListener;
import com.jeido.exercises.exercise3.listener.ToFileListener;
import com.jeido.exercises.exercise3.listener.ToJsonListener;

public class Exercise3 {
    public static void start() {
        EventListener file1 = new ToFileListener("file1");
        EventListener file2 = new ToFileListener("file2");
        EventListener file3 = new ToJsonListener("file3");

        EventManager em = new EventManager();
        System.out.println("Adding 2/3 events ...");
        em.addEventListener(file1);
        em.addEventListener(file2);
        System.out.println("Notify All");
        em.notifyAllEvents("Start");
        System.out.println("adding 3/3 events ...");
        em.addEventListener(file3);
        System.out.println("Notify All");
        em.notifyAllEvents("Ping");

    }
}
