package com.jeido.exercises.exercise7;

public class Exercise7 {
    public static void start() {
        House trad = House.traditionalBuilder
                .surfaceArea(157.6)
                .nbRooms(6)
                .nbFloors(2)
                .build();

        System.out.println(trad);

        House modern = House.modernBuilder
                .hasGarden(true)
                .nbPools(1)
                .surfaceArea(97.47)
                .nbRooms(4)
                .build();

        System.out.println(modern);
    }
}
