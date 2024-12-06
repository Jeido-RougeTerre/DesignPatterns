package com.jeido.exercises.exercise7.builder;

import com.jeido.exercises.exercise7.House;

public interface HouseBuilder {

    HouseBuilder surfaceArea(double surfaceArea);
    HouseBuilder nbRooms(int nbRooms);
    HouseBuilder nbFloors(int nbFloors);
    HouseBuilder nbPools(int nbPools);
    HouseBuilder hasGarden(boolean hasGarden);
    HouseBuilder roofType(String roofType);
    House build();
}
