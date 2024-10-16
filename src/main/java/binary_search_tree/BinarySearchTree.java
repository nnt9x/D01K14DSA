package binary_search_tree;

import java.util.Stack;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    // Thêm
    public void insert(int item) {
        // Tao node
        Node newNode = new Node(item);
        // TH1: chưa có phần tử nào, phần tử đầu tiên thêm vào -> gốc
        if (root == null) {
            root = newNode;
        }
        // TH2: có ít nhất phần tử ? Duyệt, so sánh
        Node node = root; // thuc hien viec duyet tu dau cay
        while (true) {
            // Nếu giá trị đó đã có trong cây
            if (node.getData() == item) {
                break;
            } else if (node.getData() > item) {
                // Duyet sang trai
                if (node.getLeft() == null) {
                    node.setLeft(newNode);
                    break;
                } else {
                    node = node.getLeft();
                }
            } else if (node.getData() < item) {
                // Duyet sang phai
                if (node.getRight() == null) {
                    node.setRight(newNode);
                    break;
                } else {
                    node = node.getRight();
                }
            }
        }
    }

    // In cay:
    public void inorder() {
        Stack<Node> stack = new Stack<>();
        // duyet node tu root
        Node current = root;
        while (current != null || !stack.isEmpty()) {
            // Duyet trai
            while (current != null) {
                stack.push(current);
                current = current.getLeft();
            }
            // Pop va in ra
            current = stack.pop();
            System.out.print(current.getData() + "-->");
            current = current.getRight();
        }
    }
}
