package com.company.task5sorting;

public class BoobleSorting implements Sort{
    int[] array;

    BoobleSorting(int[] array){
        this.array = array;
    }


    @Override
    public void sortingUp(int[] array) {
        int tmp;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                tmp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = tmp;
                i = 0;
            }
        }
        System.out.println("Массив по возрастанию:");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    @Override
    public void sortingDown(int[] array) {
        int tmp;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
                i = -1;
            }
        }
        System.out.println("Массив по убыванию:");
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
