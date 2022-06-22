package com.company.task4Salary;

public class WorkshopManager extends Worker{

    WorkshopManager (double salary, double experience) {
        super(salary, experience);
    }

    @Override
    double salary() {
        if (experience < 1) {
            return salary;
        } else if (experience < 3 ) {
            return salary + salary * 0.05;
        } else
            return salary + salary * 0.1;
    }

}
