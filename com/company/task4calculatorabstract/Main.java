package com.company.task4calculatorabstract;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfAction;
        double num1 = 0;
        double num2 = 0;
        do {
            System.out.println("Введите номер действия\n1 " +
                    "- Сложение\n2 - Вычитание\n3 - Умножение\n4 - Деление\n5 - Выход\n...");
            numOfAction = in.nextInt();
            if (numOfAction == 5) {
                break;
            }
            if (num1 == 0 && num2 == 0) {
                System.out.println("Введите 2 числа:");
                num1 = in.nextDouble();
                num2 = in.nextDouble();
            } else {
                System.out.println("Введите 2-ое число:");
                num2 = in.nextDouble();
            }

            Action action = null;

            switch (numOfAction) {
                case 1: {
                    action = new Addition(num1, num2);
                    break;
                }
                case 2: {
                    action = new Subtraction(num1, num2);
                    break;
                }
                case 3: {
                    action = new Multiplication(num1, num2);
                    break;
                }
                case 4: {
                    action = new Division(num1, num2);
                    break;
                }
                default:
                    action = new Action(num1, num2) {
                        @Override
                        public double action() {
                            in.nextDouble();
                            return 0;

                        }
                    };
                    break;
            }
            if (action != null) {
                num1 = action.action();
                System.out.println("Результат - " + num1);
            }
        }
        while (numOfAction != 5);
        in.close();
    }
}
