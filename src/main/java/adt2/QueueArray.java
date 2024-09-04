package adt2;

import java.util.Arrays;

public class QueueArray<T> implements Queue<T> {
    // Thuoc tinh
    private int capacity;
    private int front = -1;
    private int rear = -1;
    private T[] items;
    // Phuong thuc khoi tao


    public QueueArray(int capacity) {
        this.capacity = capacity;
        this.items = (T[]) new Object[capacity];
    }

    @Override
    public boolean enqueue(T t) {
        if (isFull()) {
            return false;
        }
        if (front == -1) {
            front = 0;
        }
        rear++;
        items[rear] = t;
        return true;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        T tmp = items[front];
        front++;
        if (front > rear) {
            front = rear = -1;
        }
        return tmp;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return items[front];
    }

    @Override
    public boolean isFull() {
        if (front == 0 && rear == capacity - 1) return true;
        return false;
    }

    @Override
    public boolean isEmpty() {
        if (front == -1 && rear == -1) return true;
        return false;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "Queue is empty";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("Queue: ");
        for (int i = front; i <= rear; i++) {
            builder.append(items[i] + "<--");
        }
        builder.append("\n");
        return builder.toString();
    }
}
