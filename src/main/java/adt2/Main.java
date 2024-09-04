package adt2;

public class Main {
    public static void main(String[] args) {
        Queue<Double> doubleQueue = new QueueArray<>(100);
        doubleQueue.enqueue(10.0);
        doubleQueue.enqueue(20.0);
        doubleQueue.enqueue(50.0);
        System.out.println(doubleQueue);
        System.out.println(doubleQueue.dequeue());
        System.out.println(doubleQueue);

        System.out.println("--------------------");

        Queue<Double> doubleQueue1 = new QueueList<>(100);
        doubleQueue1.enqueue(10.0);
        doubleQueue1.enqueue(20.0);
        doubleQueue1.enqueue(50.0);
        System.out.println(doubleQueue1);
        System.out.println(doubleQueue1.dequeue());
        System.out.println(doubleQueue1);

    }
}
