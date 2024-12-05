package com.jeido.exercises.exercise6.listener;


import com.jeido.exercises.exercise6.entity.Toy;
import com.jeido.exercises.exercise6.entity.WoodToy;

public class ElfWoodToyListener implements ToyListener {
    private final String elfName;

    public ElfWoodToyListener(String elfName) {
        this.elfName = elfName;
    }

    public String getElfName() {
        return elfName;
    }

    @Override
    public void onBuild(Toy toy) {
        if (toy instanceof WoodToy) {
            System.out.println("Send to Elf '" + getElfName() + "' : a WoodToy has been build !");
        }
    }

    @Override
    public void onPaint(Toy toy, String paint) {
        if (toy instanceof WoodToy) {
            System.out.println("Send to Elf '" + getElfName() + "' : a WoodToy has been painted : " + paint);
        }

    }
}
