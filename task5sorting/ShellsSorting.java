package com.company.task5sorting;

public class ShellsSorting implements Sort{
    int[] array;

    ShellsSorting(int[] array){
        this.array = array;
    }

    @Override
    public void sortingUp(int[] array) {
        for (int size = array.length / 2; size > 0; size /= 2) {
            for (int i = size; i < array.length; ++i) {
                for (int j = i - size; j >= 0 && array[j] > array[j + size]; j -= size) {
                    int temp = array[j];
                    array[j] = array[j + size];
                    array[j + size] = temp;
                }
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
        for (int size = array.length / 2; size > 0; size /= 2) {
            for (int i = array.length - 1; i > 0; --i) {
                for (int j = i - size; j >= 0 && array[j] < array[j + size]; j -= size) {
                    int temp = array[j];
                    array[j] = array[j + size];
                    array[j + size] = temp;
                }
            }
        }
        System.out.println("Массив по возрастанию:");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
