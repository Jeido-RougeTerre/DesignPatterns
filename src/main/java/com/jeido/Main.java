package com.jeido;


import com.jeido.ui.ConsoleLogger;

public class Main {
    public static void main(String[] args) {
        ConsoleLogger menu = ConsoleLogger.getInstance();
        menu.menu();
    }
}
