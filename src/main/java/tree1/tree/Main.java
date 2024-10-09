package tree1.tree;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Tao node
        Node<Character> nodeA = new Node<>('A');
        Node<Character> nodeB = new Node<>('B');
        Node<Character> nodeD = new Node<>('D');
        Node<Character> nodeE = new Node<>('E');
        Node<Character> nodeH = new Node<>('H');
        Node<Character> nodeI = new Node<>('I');

        Node<Character> nodeC = new Node<>('C');
        Node<Character> nodeF = new Node<>('F');
        Node<Character> nodeG = new Node<>('G');
        Node<Character> nodeJ = new Node<>('J');

        // Lien ket
        nodeA.setLeft(nodeB);
        nodeB.setLeft(nodeD);
        nodeB.setRight(nodeE);
        nodeD.setLeft(nodeH);
        nodeD.setRight(nodeI);

        nodeA.setRight(nodeC);
        nodeC.setRight(nodeG);
        nodeC.setLeft(nodeF);
        nodeF.setRight(nodeJ);

        // node1 -> root
        Node root = nodeA;

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
