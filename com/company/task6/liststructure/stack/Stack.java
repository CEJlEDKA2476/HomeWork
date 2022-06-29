package com.company.task6.liststructure.stack;

public class Stack<T> {
    private StackItem<T> peak;

    @Override
    public String toString() {
        String stackText = "";
        StackItem<T> newPeak = peak;
        while (newPeak != null){
            stackText += newPeak.toString();
            newPeak = newPeak.getNextItem();
        }
        return stackText;
    }

    public void push(T data) {
        peak = new StackItem<T>(data, peak);
    }

    public T pop() {
        StackItem<T> data = peak;
        if (data.getNextItem() != null) {
            peak = data.getNextItem();
        }
        return data.getData();
    }

    public T pop(int index, boolean isInclusive) {
        T popData = null;
        for (int i = 0; canStop(isInclusive, i, index); i++) {
            popData = pop();
        }
        return popData;
    }

    private boolean canStop(boolean isInclusive, int i, int index) {
        if (isInclusive) {
            return i <= index;
        } else {
            return i < index;
        }
    }

    public int stackSize() {
        int size = 0;
        if (peak != null) {
            while (peak.getNextItem() != null) {
                size++;
            }
        }
        return size;
    }

    public int stackSizeRecursive() {
        return stackSizeRec(0, peak);
    }


    private int stackSizeRec(int size, StackItem<T> item) {
        if (item != null) {
            return stackSizeRec(size + 1, item.getNextItem());
        }
        return size;
    }
}
