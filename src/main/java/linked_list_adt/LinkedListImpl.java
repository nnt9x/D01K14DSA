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
        if (size == 0) {
            throw new RuntimeException("Linkedlist is empty");
        } else if (size == 1) {
            head = null;
            size--;
        } else {
            // Co nhieu hon >= 2 phan tu
            Node nextNode = head.getNext();
            // Bo lien ket head => nextNode
            head.setNext(null);
            // Gan head -> nextNode
            head = nextNode;
            size--;
        }
    }

    @Override
    public void deleteAtEnd() {
        if (size == 0) {
            throw new RuntimeException("Linkedlist is empty");
        } else if (size == 1) {
            head = null;
            size--;
        } else {
            // Tim vi tri gan cuoi
            Node node = head;
            while (node.getNext().getNext() != null) {
                node = node.getNext();
            }
            // Xoa lien ket
            node.setNext(null);
            size--;
        }
    }

    @Override
    public void deleteAtPosition(int index) {
        if (index == 0) {
            deleteAtBegin();
        } else if (index == size - 1) {
            deleteAtEnd();
        } else if (index > 0 && index < size - 1) {
            // Xoa giua: cần tìm postion-1
            Node prevNode = head;
            for (int i = 0; i < index - 1; i++) {
                prevNode = prevNode.getNext();
            }
            Node currNode = prevNode.getNext();
            Node nextNode = currNode.getNext();
            // Xoa lien ket prev -> current, chuyen sang next
            prevNode.setNext(nextNode);
            // Xoa lien ket current -> next
            currNode.setNext(null);
            size--;
        } else {
            throw new RuntimeException("Index out of range");
        }
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
