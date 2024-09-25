package linkedlist2;

public class LinkedList<T> {
    // Thuộc tính
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    // Phuong thuc them: dau, giua, cuoi
    public void insertAtEnd(T t) {
        // Buoc 1: Tao ra node chua t
        Node tmp = new Node(t);
        // Neu head = null -> thêm vào đầu hàng -> cuối hàng như nhau
        if (head == null) {
            head = tmp;
            return;
        }
        // Nguoc lai: head ko null -> cần tìm node cuối cùng
        // node cuối cùng: có next = null
        Node node = head;
        while (node.getNext() != null) {
            node = node.getNext();
        }
        // Sau vòng lặp -> tìm node cuối
        node.setNext(tmp);
    }

    // Them vao dau hang
    public void insertAtBegin(T t) {
        // Tao node tmp
        Node tmp = new Node(t);
        // Neu head = null -> DS -> chua co phan tu nao
        if (head == null) {
            head = tmp;
            return;
        }
        // Ds co phan tu
        tmp.setNext(head);
        head = tmp;
    }

    // Xoa phan tu dau hang
    public T deleteAtBegin() {
        if (head == null) {
            throw new RuntimeException("Linked list is empty");
        }
        // Neu chi co 1 phan tu la head
        if (head.getNext() == null) {
            Node<T> oldHead = head;
            head = null;
            return oldHead.getData();
        }
        // Co nhieu hon 1 phan tu ?
        // Head -> node1 -> node2 -> node3
        Node<T> oldHead = head;
        Node newHead = head.getNext();
        // Bo lien ket head hien tai -> head next
        head.setNext(null);
        // Gan head = newHead
        head = newHead;

        return oldHead.getData();
    }

    // Xoa vi tri cuoi hang
    public T deleteAtEnd() {
        if (head == null) {
            throw new RuntimeException("Linked list is empty");
        }
        if (head.getNext() == null) {
            Node<T> oldHead = head;
            head = null;
            return oldHead.getData();
        }
        // Co nhieu hon 1 phan tu ?
        // Để xoá cuối hàng -> cần tìm dc vị trí của phần tử gần cuối
        Node tmp = head;
        while (tmp.getNext().getNext() != null) {
            tmp = tmp.getNext();
        }
        // tmp luc nay la gan cuoi
        Node<T> oldEnd = tmp.getNext();
        // Xoa lien ket tu tmp-> oldEnd
        tmp.setNext(null);
        return oldEnd.getData();
    }


    // display
    public void display() {
        Node tmp = head;
        if (tmp == null) {
            System.out.println("Linked list is empty");
        }
        while (true) {
            if (tmp != null) {
                System.out.print(tmp.getData() + "-->");
            } else {
                System.out.print("NULL");
                break;
            }
            tmp = tmp.getNext();
        }
    }


}
