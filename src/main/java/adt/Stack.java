package adt;

public interface Stack<T> {
    // generic: tham so hoa kieu du lieu
    void push(T t);

    T pop();

    T peek();

    boolean isEmpty();

    boolean isFull();

    void display();

    String toString();
}
