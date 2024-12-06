package com.jeido.exercises.exercise7.builder;

import com.jeido.exercises.exercise7.House;

public class ModernHouseBuilder implements HouseBuilder {
    private double surfaceArea = 0.0;
    private int nbRooms = 1;
    private int nbFloors = 1;
    private int nbPools = 0;
    private boolean hasGarden = false;
    private final String roofType = "Flat";

    @Override
    public HouseBuilder surfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
        return this;
    }

    @Override
    public HouseBuilder nbRooms(int nbRooms) {
        this.nbRooms = nbRooms;
        return this;
    }

    @Override
    public HouseBuilder nbFloors(int nbFloors) {
        this.nbFloors = nbFloors;
        return this;
    }

    @Override
    public HouseBuilder nbPools(int nbPools) {
        this.nbPools = nbPools;
        return this;
    }

    @Override
    public HouseBuilder hasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
        return this;
    }

    @Override
    public HouseBuilder roofType(String roofType) {
        return this;
    }

    @Override
    public House build() {
        return new House(surfaceArea, nbRooms, nbFloors, nbPools, hasGarden, roofType);
    }
}
