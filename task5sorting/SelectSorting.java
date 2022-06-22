package com.company.task5sorting;

public class SelectSorting implements Sort{
    int[] array;

    SelectSorting(int[] array){
        this.array = array;
    }
    @Override
    public void sortingUp(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;
        }
        System.out.println("Массив по возрастанию:");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    @Override
    public void sortingDown(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            int pos = i;
            int min = array[i];
            for (int j = i - 1; j >= 0; j--) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;
        }
        System.out.println("Массив по убыванию:");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
