package binary_search_tree_adt;

import java.util.Stack;

public class BinarySearchTreeImpl<T extends Comparable<T>, K>
        implements BinarySearchTree<T, K> {
    private Node<T> root;

    public BinarySearchTreeImpl() {
        this.root = null;
    }

    @Override
    public void insert(T item) {
        // Tao node
        Node<T> newNode = new Node<>(item);
        // TH1: chưa có phần tử nào
        if (root == null) {
            root = newNode;
        } else {
            // Co it nhat 1 phan tu
            Node<T> node = root;

            while (true) {
                // Bang nhau
                if (node.getData().compareTo(item) == 0) {
                    break;
                }
                // node có data > item -> item cần thêm vào bên trái
                else if (node.getData().compareTo(item) > 0) {
                    // duyet sang trai
                    if (node.getLeft() == null) {
                        node.setLeft(newNode);
                        break;
                    } else {
                        node = node.getLeft();
                    }
                } else if (node.getData().compareTo(item) < 0) {
                    // duyet sang phai
                    if (node.getRight() == null) {
                        node.setRight(newNode);
                        break;
                    } else {
                        node = node.getRight();
                    }
                }
            }
        }
    }

    @Override
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

    @Override
    public void preorder() {
        // todo
    }

    @Override
    public void postorder() {
        // todo
    }

    @Override
    public T search(K k) {
        return null;
    }
}
