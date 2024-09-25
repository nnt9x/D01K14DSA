package linkedlist2;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertAtEnd(10);
        linkedList.insertAtEnd(20);
        linkedList.insertAtBegin(40);
        linkedList.insertAtEnd(50);
        System.out.println(linkedList.deleteAtBegin());
        linkedList.insertAtEnd(70);
        System.out.println(linkedList.deleteAtEnd());
        System.out.println(linkedList.deleteAtEnd());
        // 10->20->50
        linkedList.display();
    }
}
