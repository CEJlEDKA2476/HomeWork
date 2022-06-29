package com.company.task4Salary;

public class Worker {
    protected double salary;
    protected double experience;

    Worker (double salary, double experience) {
        this.salary = salary;
        this.experience = experience;
    }

    double salary () {
        if (experience < 1) {
            return salary + salary * 0.1;
        } else if (experience < 3 ) {
            return salary + salary * 0.15;
        } else
            return salary + salary * 0.2;
        }

}
