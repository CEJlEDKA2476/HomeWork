package com.company.task5temperature;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        new CelsiusDegrees.CelsiusAdapter();


        Scanner in = new Scanner(System.in);

        System.out.print("Выберите, какие у вас градусы\n1 - Цельсия\n2 - Фаренгейта\n3 - Кельвина\n");
        int numOfDegrees = in.nextInt();
        System.out.println("Введите количество градусов.");
        double number = in.nextDouble();

        Calculate action = null;

        switch (numOfDegrees) {
            case 1: {
                action = new CelsiusDegrees(number);
                break;
            }
            case 2: {
                action = new FahrenheitDegrees(number);
                break;
            }
            case 3: {
                action = new KelvinDegrees(number);
                break;
            }
            default:
                System.out.println("Введен неверный номер.");
                break;
        }

        System.out.print("Введите, в какие градусы переводить.\n1 - Цельсия\n2 - Фаренгейта\n3 - Кельвина\n");
        int numOfAction = in.nextInt();

        if (action == null) {
            System.out.println("Что-то пошло не так.");
            return;
        }

        switch (numOfAction) {
            case 1: {
                System.out.println(action.calculateCelsius());
                break;
            }
            case 2: {
                System.out.println(action.calculateFahrenheit());
                break;
            }
            case 3: {
                System.out.println(action.calculateKelvin());
                break;
            }
            default: {
                System.out.println("Введен неверный номер.");
                break;
            }
        }
    }
}

