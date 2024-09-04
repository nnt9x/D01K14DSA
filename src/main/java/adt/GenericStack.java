package adt;

import java.util.Arrays;

public class GenericStack<T> implements Stack<T> {
    // Thuoc tinh
    private int capacity; // Kich thuoc
    private int top = -1;
    private T[] items;

    // Phuong thuc khoi tao
    public GenericStack(int capacity) {
        this.capacity = capacity;
        this.items = (T[]) new Object[capacity];
    }

    @Override
    public void push(T t) {
        if (isFull()) {
            throw new RuntimeException("Hàng đợi đã đầy");
        }
        top = top + 1;
        items[top] = t;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Hàng đợi rỗng!");
        }
        T tmp = items[top];
        top = top - 1;
        return tmp;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Hàng đợi rỗng!");
        }
        return items[top];
    }

    @Override
    public boolean isEmpty() {
        if (top == -1) return true;
        return false;
    }

    @Override
    public boolean isFull() {
        if (top == capacity - 1) return true;
        return false;
    }

    @Override
    public void display() {
        if (isEmpty()) {
            System.out.println("Hàng đợi rỗng!");
            return;
        }
        System.out.println("Hàng đợi: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(items[i]);
        }
        System.out.println("------------");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (isEmpty()) {
            return "Hàng đợi rỗng!";
        }
        builder.append("Hàng đợi: \n");
        for (int i = top; i >= 0; i--) {
            builder.append(items[i] + "\n");
        }
        builder.append("------------");
        return builder.toString();
    }
}
