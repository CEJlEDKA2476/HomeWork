package com.company.task6.liststructure.stack;

public class StackItem <T> {
    private T data;
    private StackItem<T> nextItem;

    StackItem(T data, StackItem<T> nextItem){
        this.data = data;
        this.nextItem = nextItem;
    }

    @Override
    public String toString() {
        return data.toString();
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public StackItem<T> getNextItem() {
        return nextItem;
    }

    public void setNextItem(StackItem<T> nextItem) {
        this.nextItem = nextItem;
    }
}
