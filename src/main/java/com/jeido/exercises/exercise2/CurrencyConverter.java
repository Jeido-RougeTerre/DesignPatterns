package com.jeido.exercises.exercise2;

public class CurrencyConverter {
    public double convertToUSD(String currency, double amount) {
        return switch (currency.toUpperCase()) {
            case "EUR" -> amount * 1.1;
            case "GBP" -> amount * 1.3;
            default -> amount;
        };
    }

    public double convertFromUSD(String currency, double amount) {
        return switch (currency.toUpperCase()) {
            case "EUR" -> amount / 1.1;
            case "GBP" -> amount / 1.3;
            default -> amount;
        };
    }
}
