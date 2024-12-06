package com.jeido.exercises.exercise8.entity;

public class IndividualEmployee implements Employee{
    private String name;

    public IndividualEmployee(String name) {
        this.name = name;
    }

    @Override
    public String showDetails() {
        return "Employee : '" + name + "'";
    }
}
