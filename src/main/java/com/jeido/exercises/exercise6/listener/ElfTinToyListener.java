package com.jeido.exercises.exercise6.listener;

import com.jeido.exercises.exercise6.entity.TinToy;
import com.jeido.exercises.exercise6.entity.Toy;
import com.jeido.exercises.exercise6.entity.WoodToy;

public class ElfTinToyListener implements ToyListener {
    private final String elfName;

    public ElfTinToyListener(String elfName) {
        this.elfName = elfName;
    }

    public String getElfName() {
        return elfName;
    }

    @Override
    public void onBuild(Toy toy) {
        if (toy instanceof TinToy) {
            System.out.println("Send to Elf '" + getElfName() + "' : a Tin Toy has been build !");
        }
    }

    @Override
    public void onPaint(Toy toy, String paint) {
        if (toy instanceof TinToy) {
            System.out.println("Send to Elf '" + getElfName() + "' : a Tin Toy has been painted : " + paint);
        }

    }
}
