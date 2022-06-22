package com.company.task5network;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(true);
        Printer3D printer3D = new Printer3D(true);
        Display display = new Display(true);
        TV tv = new TV(true);

        System.out.print("Устройства в сети:\n");
        if (printer.activity) {
            System.out.println("1. Принтер");
        }
        if (printer3D.activity) {
            System.out.println("2. 3Д Принтер");
        }
        if (display.activity) {
            System.out.println("3. Дисплей");
        }
        if (tv.activity) {
            System.out.println("4. Телевизор");
        }

        System.out.println("Выберите подходящее вам устройство.");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        in.nextLine();
        System.out.println("Введите сообщение");
        String message = in.nextLine();
        Device device = null;
        int numberOfAction = 0;
        do {
            switch (number) {
                case 1: {
                    device = printer;
                    if (device.activity) {
                        printer.print(message);
                    } else {
                        System.out.println("Устройство не в сети.");
                    }
                    break;
                }
                case 2: {
                    device = printer3D;
                    if (device.activity) {
                        printer3D.print(message);
                    } else {
                        System.out.println("Устройство не в сети.");
                    }
                    break;
                }
                case 3: {
                    device = display;
                    if (device.activity) {
                        display.print(message);
                    } else {
                        System.out.println("Устройство не в сети.");
                    }
                    break;
                }
                case 4: {
                    device = tv;
                    if (device.activity) {
                        tv.print(message);
                    } else {
                        System.out.println("Устройство не в сети.");
                    }
                    break;
                }
                default:
                    System.out.println("Введен неверный номер.");
                    break;
            }
            System.out.print("1 - Продолжить на этом устройстве\n2 - Выбрать другое\n3 - Выход");
            numberOfAction = in.nextInt();
            in.nextLine();
            if (numberOfAction == 1) {
                System.out.println("Введите новое сообщение");
                message = in.nextLine();
                if (device != null) {
                    device.print(message);
                }
            } else if (numberOfAction == 2) {
                System.out.println("Введите номер устройства.");
                number = in.nextInt();
                System.out.println("Введите новое сообщение");
                in.nextLine();
                message = in.nextLine();
            }
        } while (numberOfAction != 3);
    }
}
