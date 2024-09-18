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
    public void insertAtBegin(T t){
        // Tao node tmp
        Node tmp = new Node(t);
        // Neu head = null -> DS -> chua co phan tu nao
        if(head == null){
            head = tmp;
            return;
        }
        // Ds co phan tu
        tmp.setNext(head);
        head = tmp;
    }



    // display
    public void display() {
        Node tmp = head;
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
