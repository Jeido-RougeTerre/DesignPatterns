package com.jeido.exercises.exercise8.entity;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
    private String name;
    private List<Employee> employees;

    public Manager(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        if (employee == null || employee == this || employees.contains(employee)) return;
        employees.add(employee);
    }

    @Override
    public String showDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append("Manager '").append(name).append("'");
        for (Employee employee : employees) {
            sb.append("\n").append(employee.showDetails());
        }
        return sb.toString();
    }
}
