package linkedlist2;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertAtEnd(10);
        linkedList.insertAtEnd(20);
        linkedList.insertAtBegin(40);
        linkedList.insertAtEnd(50);
        linkedList.insertAtEnd(70);
        // 40->10->20->50->70
        linkedList.display();
    }
}
