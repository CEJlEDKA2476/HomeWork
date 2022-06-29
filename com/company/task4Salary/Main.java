package com.company.task4Salary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;

//        Worker worker = new Worker(200d,10d);
//        System.out.println(worker.salary());
//
//        WorkshopManager workshopManager = new WorkshopManager(350d, 2.5);
//        System.out.println(workshopManager.salary());
//
//        Director director = new Director(500d);
//        System.out.println(director.salary());

        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер работника:\n1 - Директор\n2 - Начальник цеха\n3 - Рабочий");
        number = in.nextInt();
        Worker worker1 = null;

        switch (number) {
            case 1: {
                System.out.println("Введите ставку работника:");
                double directorSalary;
                directorSalary = in.nextDouble();
                worker1 = new Director(directorSalary, 3);
                break;
            }
            case 2: {
                System.out.println("Введите ставку работника и его опыт работы:");
                worker1 = new WorkshopManager(in.nextDouble(), in.nextDouble());
                break;
            }
            case 3: {
                System.out.println("Введите ставку работника и его опыт работы:");
                worker1 = new Worker(in.nextDouble(),in.nextDouble());
                break;
            }
            default:
                System.out.println("Введен неверный номер.");
                break;
        }
        if (worker1 != null) {
            System.out.println("Заработная плата работника - " + worker1.salary());
        }
    }
}
