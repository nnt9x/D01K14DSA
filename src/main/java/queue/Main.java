package queue;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tao hang doi gom 10 phan tu
        Queue q = new Queue(10);
        q.enqueue(10);
        q.enqueue(30);
        System.out.println(q.dequeue());
        q.enqueue(20);
        System.out.println(q.dequeue());
        q.enqueue(40);

        // 10 <- 30 <- 20 <- 40
        // In ra hang doi
        q.display();
    }
}
