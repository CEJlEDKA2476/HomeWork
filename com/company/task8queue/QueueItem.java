package com.company.task8queue;

public class QueueItem<T> {
    private T data;
    private QueueItem<T> nextItem;

    QueueItem(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public QueueItem<T> getNextItem() {
        return nextItem;
    }

    public void setNextItem(QueueItem<T> nextItem) {
        this.nextItem = nextItem;
    }
}
