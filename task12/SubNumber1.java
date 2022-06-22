package com.company.task12;

public class SubNumber1 {
    SubNumber1() {
    }

    public void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public int[] checkArray(int[] array1, int[] array2) {
        int[] subArray = array1;
        if (array1.length < array2.length) {
            subArray = fillArray(array1, array2);
        }
        return subArray;
    }

    private int[] fillArray(int[] array1, int[] array2) {
        int[] subArray = new int[array2.length];
        int counter = subArray.length - 1;
        for(int i = array1.length - 1; i >= 0; i--){
            subArray[counter--] = array1[i];
        }
        return subArray;
    }

    public void addition(int[] array1, int[] array2) {
        int[] additionArray = new int[array1.length + 1];
        int length = array1.length;

        for (int i = length - 1; i > 0; i--) {
            additionArray[i] = additionArray[i] + array1[i] + array2[i];

            if (additionArray[i] == 2) {
                additionArray[i - 1] = additionArray[i - 1] + 1;
                additionArray[i] = 0;
            }

            if (additionArray[i] == 3) {
                additionArray[i - 1] = additionArray[i - 1] + 1;
                additionArray[i] = 1;
            }
        }
        printArray(additionArray);
    }
}

