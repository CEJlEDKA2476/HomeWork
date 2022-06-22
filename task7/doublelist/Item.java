package com.company.task7.doublelist;

public class Item<T> {
    private int data;
    private Item<T> nextItem;
    private Item<T> previousItem;

    Item(int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Item<T> getNextItem() {
        return nextItem;
    }

    public void setNextItem(Item<T> nextItem) {
        this.nextItem = nextItem;
    }

    public Item<T> getPreviousItem() {
        return previousItem;
    }

    public void setPreviousItem(Item<T> previousItem) {
        this.previousItem = previousItem;
    }
}
