package btqueue;

public class QueueDocument {
    // Thuoc tinh
    private int capacity; // kich thuoc
    private int size; // Kich thuoc hien tai
    private int front = -1; // chi so dau hang
    private int rear = -1; // chi so cuoi hang

    // 1 mang chua cac phan tu
    private Document[] items;

    // Phuong thuc khoi tao
    public QueueDocument(int capacity) {
        if (capacity <= 0) {
            throw new RuntimeException("Kích thước không hợp lệ");
        }
        this.capacity = capacity;
        this.items = new Document[capacity]; // Tao mang co kich thuoc = hang doi
    }

    public boolean isEmpty() {
        // Khi nao rong
        if (rear == -1 && front == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (this.front == 0 && this.rear == capacity - 1) {
            return true;
        }
        return false;
    }

    public int size() {
        if (isEmpty()) return 0;
        return (rear - front + 1);
    }

    // Them 1 phan tu vao cuoi hang doi: enqueue()
    public void enqueue(Document item) {
        // Buoc 1:
        if (isFull()) {
            throw new RuntimeException("Hàng đợi đã đầy!");
        }
        // Buoc 2: TH thêm phần tử đầu
        if (front == -1) {
            front = 0;
        }
        rear++;
        items[rear] = item;
    }

    // Lay 1 phan tu dau hang doi: dequeue()
    public Document dequeue() {
        // Buoc 1: Hang doi co rong hay khong
        if (isEmpty()) {
            throw new RuntimeException("Hàng đợi rỗng!");
        }
        Document item = items[front];
        // Neu front >= rear -> đây là phần tử cuối -> reset vi tri
        if (front >= rear) {
            front = -1;
            rear = -1;
        } else {
            front++;
        }
        return item;
    }

    // Them 1 phuong thuc hien thi hang doi.
    public void display() {
        if (isEmpty()) {
            System.out.println("Hàng đợi rỗng!");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(items[i].toString());
                System.out.print(" <-- ");
            }
            System.out.println();
        }
    }
}
