package linked_list_adt;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedListImpl<>();
        linkedList.insertAtBegin(10);
        linkedList.insertAtBegin(20);
        linkedList.display();
        System.out.println("Kích thước: " + linkedList.size());

        linkedList.insertAtBegin(30);
        linkedList.display();
        System.out.println("Kích thước: " + linkedList.size());

        // Them vao cuoi
        linkedList.insertAtEnd(50);
        linkedList.display();
        System.out.println("Kích thước: " + linkedList.size());

        // Them vao vi tri index = 2
        linkedList.insertAtPosition(2, 100);
        linkedList.display();
        System.out.println("Kích thước: " + linkedList.size());

        linkedList.insertAtPosition(2, 200);
        linkedList.display();
        System.out.println("Kích thước: " + linkedList.size());

        linkedList.insertAtPosition(20, 200);

    }
}
