package binary_search_tree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(10);
        // 20, 30, 0, 8, 9, 10, 7, 8, 1 , 5, 100.
        binarySearchTree.insert(20);
        binarySearchTree.insert(30);
        binarySearchTree.insert(0);
        binarySearchTree.insert(8);
        binarySearchTree.insert(9);
        binarySearchTree.insert(10);
        binarySearchTree.insert(7);
        binarySearchTree.insert(8);
        binarySearchTree.insert(1);
        binarySearchTree.insert(5);
        binarySearchTree.insert(100);

        // In bang inorder
        binarySearchTree.inorder();
    }
}
