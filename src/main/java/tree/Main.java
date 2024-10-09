package tree;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Tao node
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        // Lien ket node => tree
        node1.setRight(node3);
        node1.setLeft(node2);
        node2.setLeft(node4);
        node2.setRight(node5);

        // node1 -> root
        Node root = node1;

        // Duyet cay theo inorder: left->root->right
        // Sử dụng Stack có sẵn (Java)
        Stack<Node> stack = new Stack<>();

        // duyet node tu root
        Node current = root;
        while (current != null || !stack.isEmpty()) {
            // Duyet trai
            while (current != null){
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
