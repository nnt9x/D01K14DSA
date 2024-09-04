package adt2;

import java.util.ArrayList;
import java.util.List;

public class QueueList<T> implements Queue<T> {
    private int capacity;
    private List<T> items;

    public QueueList(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>(capacity);
    }

    @Override
    public boolean enqueue(T t) {
        if (isFull()) {
            return false;
        }
        items.add(t);
        return true;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        // Lay phan tu dau hang
        T tmp = items.get(0);
        // Xoa khoi items
        items.remove(tmp);
        return tmp;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return items.get(0);
    }

    @Override
    public boolean isFull() {
        if (items.size() == capacity) return true;
        return false;
    }

    @Override
    public boolean isEmpty() {
        if (items.size() == 0) return true;
        return false;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "Queue is empty";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("Queue: ");
        for (int i = 0; i < items.size(); i++) {
            builder.append(items.get(i) + "<--");
        }
        builder.append("\n");
        return builder.toString();
    }
}
