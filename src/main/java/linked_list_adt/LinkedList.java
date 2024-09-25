package linked_list_adt;

public interface LinkedList<T> {
    // Phép toán
    public void insertAtBegin(T t);

    public void insertAtEnd(T t);

    public void insertAtPosition(int index, T t);

    public void deleteAtBegin();

    public void deleteAtEnd();

    public void deleteAtPosition(int index);

    public int size();

    public void display();
}
