package com.jeido.exercises.exercise2;

import com.jeido.exercises.exercise2.adapter.Converter;
import com.jeido.exercises.exercise2.adapter.CurrencyAdapter;

public class Exercise2 {
    public static void start() {
        CurrencyConverter converter = new CurrencyConverter();
        CurrencyAdapter currencyAdapter = new Converter(converter);

        System.out.println("100 EUR into GBP : " + currencyAdapter.convert("EUR", "GBP", 100));
        System.out.println("60 GBP into USD : " + currencyAdapter.convert("GBP", "USD", 60));

    }
}
