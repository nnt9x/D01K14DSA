package binary_search_tree_adt;

public interface BinarySearchTree<T extends Comparable<T>, K> {
    void insert(T item);

    void inorder();

    void preorder();

    void postorder();

    T search(K k);
}
