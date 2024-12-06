package com.jeido.exercises.exercise8;

import com.jeido.exercises.exercise8.entity.Employee;
import com.jeido.exercises.exercise8.entity.IndividualEmployee;
import com.jeido.exercises.exercise8.entity.Manager;

public class Exercise8 {
    public static void start() {
        Employee employee1 = new IndividualEmployee("John Doe");
        Employee employee2 = new IndividualEmployee("Jane Doe");
        Employee employee3 = new IndividualEmployee("Kelly Doe");

        Manager manager1 = new Manager("John CEO");
        Manager manager2 = new Manager("Jane Chief");

        manager2.addEmployee(employee1);
        manager2.addEmployee(employee2);

        manager1.addEmployee(employee3);
        manager1.addEmployee(manager2);

        System.out.println(manager1.showDetails());

    }
}
