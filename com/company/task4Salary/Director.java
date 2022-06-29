package com.company.task4Salary;

public class Director extends Worker {

    Director (double salary, double experience) {
        super(salary, experience);
    }

    double salary () {
        return salary * 5.5;
    }
}
