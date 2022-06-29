package com.company.task6.liststructure.list;

public class Item {
    private int data;
    private Item next;

    public Item(int data) {
        this.data = data;
    }

    public void setData(int data){
        this.data = data;
    }

    public int getData(){
        return data;
    }

    public void setNext(Item next){
        this.next = next;
    }

    public Item getNext(){
        return next;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}
