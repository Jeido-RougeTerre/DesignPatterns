package com.jeido.exercises.exercise2.adapter;

import com.jeido.exercises.exercise2.CurrencyConverter;

public class Converter implements CurrencyAdapter {

    private final CurrencyConverter cv;

    public Converter(CurrencyConverter cv) {
        this.cv = cv;
    }

    @Override
    public double convert(String from, String to, double amount) {

        double amountInUSD = cv.convertToUSD(from, amount);

        return cv.convertFromUSD(to, amountInUSD);
    }
}
