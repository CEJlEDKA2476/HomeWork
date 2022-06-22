package com.company.task5sorting;

import java.util.Scanner;

//2 4 1 3 5 7 6 9 8 10
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Введите массив из 10 чисел.");
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = in.nextInt();
        }
        System.out.print("1 - метод пузырьком\n2 - метод выбора\n3 - метод Шелла\n0 - Выход\n");
        int numberOfSorting = in.nextInt();
        if(numberOfSorting == 0) {
            System.out.println("Завершение.");
            return;
        }
        System.out.print("1 - по возростанию\n2 - по убыванию\n");
        int UpOrDown = in.nextInt();



        switch (numberOfSorting) {
            case 1: {
                BoobleSorting booblearray = new BoobleSorting(array);
                if (UpOrDown == 1) {
                    booblearray.sortingUp(array);
                }else if(UpOrDown == 2){
                    booblearray.sortingDown(array);
                }else {
                    System.out.println("Введен неверный номер.");
                }
                break;
            }
            case 2: {
                SelectSorting selectSorting = new SelectSorting(array);
                if (UpOrDown == 1) {
                    selectSorting.sortingUp(array);
                }else if(UpOrDown == 2){
                    selectSorting.sortingDown(array);
                }else {
                    System.out.println("Введен неверный номер.");
                }
                break;
            }
            case 3: {
                ShellsSorting shellsSorting = new ShellsSorting(array);
                if (UpOrDown == 1) {
                    shellsSorting.sortingUp(array);
                }else if(UpOrDown == 2){
                    shellsSorting.sortingDown(array);
                }else {
                    System.out.println("Введен неверный номер.");
                }
                break;
            }
            default: {
                System.out.println("Введен неверный номер.");
            }
        }
    }
}
