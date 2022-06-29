package com.company.task8queue;

public class Queue<T> {
    private QueueItem<T> peak;

    private QueueItem<T> lastObject() {
        QueueItem<T> object = peak;
        while (object != null) {
            object = object.getNextItem();
        }
        return object;
    }

    public void add(T addObject) {
        QueueItem<T> object = new QueueItem<>(addObject);
        QueueItem<T> lastObject = lastObject();
        if (lastObject != null) {
            lastObject.setNextItem(object);
        } else {
            peak = object;
        }
    }

    public T poll() {
        T data = peak.getData();
        peak = peak.getNextItem();
        return data;
    }
}
