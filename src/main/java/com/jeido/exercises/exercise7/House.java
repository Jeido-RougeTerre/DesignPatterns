package com.jeido.exercises.exercise7;

import com.jeido.exercises.exercise7.builder.ModernHouseBuilder;
import com.jeido.exercises.exercise7.builder.TraditionalHouseBuilder;

public class House {
    private double surfaceArea;
    private int nbRooms;
    private int nbFloors;
    private int nbPools;
    private boolean hasGarden;
    private String roofType;

    public static ModernHouseBuilder modernBuilder = new ModernHouseBuilder();
    public static TraditionalHouseBuilder traditionalBuilder = new TraditionalHouseBuilder();

    public House(double surfaceArea, int nbRooms, int nbFloors, int nbPools, boolean hasGarden, String roofType) {
        this.surfaceArea = surfaceArea;
        this.nbRooms = nbRooms;
        this.nbFloors = nbFloors;
        this.nbPools = nbPools;
        this.hasGarden = hasGarden;
        this.roofType = roofType;
    }

    @Override
    public String toString() {
        return "House{" +
                "surfaceArea=" + surfaceArea +
                ", nbRooms=" + nbRooms +
                ", nbFloors=" + nbFloors +
                ", nbPools=" + nbPools +
                ", hasGarden=" + hasGarden +
                ", roofType='" + roofType + '\'' +
                '}';
    }
}
