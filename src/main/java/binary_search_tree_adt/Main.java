package binary_search_tree_adt;

public class Main {
    public static void main(String[] args) {
        // 6 ban sinh vien
        Student s1 = new Student(1, "SV 1", 10);
        Student s3 = new Student(3, "SV 3", 9);
        Student s4 = new Student(4, "SV 4", 7);
        Student s6 = new Student(6, "SV 6", 8);
        Student s8 = new Student(8, "SV 8", 5);
        Student s10 = new Student(10, "SV 10", 6);

        // Tao cay va them cac ban sinh vien vao cay
        BinarySearchTree<Student, Integer> binarySearchTree =
                new BinarySearchTreeImpl<Student, Integer>();

        binarySearchTree.insert(s8);
        binarySearchTree.insert(s10);
        binarySearchTree.insert(s3);
        binarySearchTree.insert(s1);
        binarySearchTree.insert(s6);
        binarySearchTree.insert(s4);

        // Thuc hien duyet va in ra
        binarySearchTree.inorder();

    }
}
