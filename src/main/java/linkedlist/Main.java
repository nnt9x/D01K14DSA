package linkedlist;

public class Main {
    public static void main(String[] args) {
        // Node 1 -> Node 2 -> Node 4 -> Node 3
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(10);
        node1.setNext(node2);
        node2.setNext(node4);
        node4.setNext(node3);
        node3.setNext(node5);

        // Duyet danh sach lien ket
        // Duyet tu node dau tien
        // Tai moi lan duyet -> kiem tra xem có node Next
        // Nếu có next: node hiện tại => gán next
        // Duyệt đến khi node->getNext() = null

        Node tmp = node1;
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
