package adt2;

public interface Queue<T> {
    boolean enqueue(T t);

    T dequeue();

    T peek();

    boolean isFull();

    boolean isEmpty();

    String toString();
}
