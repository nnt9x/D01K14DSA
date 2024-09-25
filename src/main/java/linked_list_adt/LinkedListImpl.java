package linked_list_adt;

// DS liên kết đơn
public class LinkedListImpl
        <T> implements LinkedList<T> {

    // Thuộc tính
    private Node<T> head = null;
    private int size = 0;

    @Override
    public void insertAtBegin(T t) {
        // Thêm vào đầu danh sách
        Node<T> newNode = new Node<>(t);

        // TH1: chưa có phần tử nào ?
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        // TH2: có ít nhất 1 phần tử
        // Trỏ newNode -> head hiện tại
        newNode.setNext(head);
        // Head trỏ về newNode (newNode -> head mới)
        head = newNode;
        size++;
    }

    @Override
    public void insertAtEnd(T t) {
        // Thêm vào đầu danh sách
        Node<T> newNode = new Node<>(t);

        // TH1: chưa có phần tử nào ?
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        // TH2: có 1 phần tử
        if (head.getNext() == null) {
            head = newNode;
            size++;
            return;
        }
        // TH3: có ít nhất 2 phần tử.
        Node lastNode = head;
        while (lastNode.getNext() != null) {
            lastNode = lastNode.getNext();
        }
        // next lastNode => newNode
        lastNode.setNext(newNode);
        size++;
    }

    @Override
    public void insertAtPosition(int index, T t) {
        if (index == 0) {
            insertAtBegin(t);
        }
        // TH2: them vao cuoi
        else if (index == size) {
            insertAtEnd(t);
        }
        // TH3: thêm vào giữa
        else if (index > 0 && index < size) {
            // B1: Tao node
            Node newNode = new Node(t);
            // B2: Cần tìm dc vị trí index-1 và index
            Node prevNode = head; // index -1
            Node currentNode; // index
            for (int i = 0; i < index - 1; i++) {
                prevNode = prevNode.getNext();
            }
            // B3: tinh currentNode
            currentNode = prevNode.getNext();
            // B4: insert
            prevNode.setNext(newNode);
            newNode.setNext(currentNode);

            size++;
        }
        // TH4:
        else {
            throw new RuntimeException("Index out of range");
        }
    }

    @Override
    public void deleteAtBegin() {

    }

    @Override
    public void deleteAtEnd() {

    }

    @Override
    public void deleteAtPosition(int index) {

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void display() {
        if (size == 0) {
            System.out.println("Linkedlist is empty");
            return;
        }
        Node node = head;
        while (node != null) {
            System.out.print(node.getData() + "-->");
            node = node.getNext();
        }
        System.out.println();
    }
}
