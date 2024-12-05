package com.jeido.exercises.exercise3;

import com.jeido.exercises.exercise3.listener.ToFileListener;

public class Exercise3 {
    public static void start() {
        ToFileListener tfl1 = new ToFileListener("ToFile1.txt");
        ToFileListener tfl2 = new ToFileListener("ToFile2.txt");
        ToFileListener tfl3 = new ToFileListener("ToFile3.txt");

        EventManager em = new EventManager();
        System.out.println("Adding 2/3 events ...");
        em.addEventListener(tfl1);
        em.addEventListener(tfl2);
        System.out.println("Notify All");
        em.notifyAllEvents("Start");
        System.out.println("adding 3/3 events ...");
        em.addEventListener(tfl3);
        System.out.println("Notify All");
        em.notifyAllEvents("Ping");

    }
}
