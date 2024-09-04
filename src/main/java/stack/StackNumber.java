package stack;

public class StackNumber {
    // Thuộc tính
    private int capacity; // kich thuoc
    private int top = -1;
    private int[] items;

    // Phuong thuc khoi tao
    public StackNumber(int capacity) {
        if (capacity <= 0) {
            throw new RuntimeException("Số lượng không hợp lệ!");
        }
        this.capacity = capacity;
        this.items = new int[capacity];
    }

    public boolean isFull() {
        if (top == capacity - 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    // Định nghĩa các phép toán
    // push: thêm phần tử vào trên cùng
    public void push(int item) {
        // Buoc 1: Kiem tra xem da day hay chua?
        if (isFull()) {
            throw new RuntimeException("Ngăn xếp đã đầy!");
        }
        // Buoc 2: top -> 1 don vi
        top = top + 1;
        // Buoc 3: gan gia tri tai vi tri top
        items[top] = item;
    }

    // pop: lay ra phan tu tren cung
    public int pop() {
        // Buoc 1: Kiem tra xem co rong hay ko?
        if (isEmpty()) {
            throw new RuntimeException("Ngăn xếp rỗng!");
        }
        // Buoc 2: lay ra item o vi tri top hien tai
        int tmp = items[top];
        // Buoc 3: tru top hien tai 1 don vi
        top = top - 1;
        // Buoc 4: tra ve ket qua
        return tmp;
    }

    public int peek() {
        // Buoc 1: Kiem tra xem co rong hay ko?
        if (isEmpty()) {
            throw new RuntimeException("Ngăn xếp rỗng!");
        }
        // Buoc 2:
        return items[top];
    }

    // Lay ra kich thuoc size
    public int size() {
        if (isEmpty()) return 0;
        return top + 1;
    }
    // In ra ngan xep
    public void display(){
        if(isEmpty()){
            System.out.println("Ngăn xếp rỗng");
            return;
        }
        System.out.println("------Ngăn xếp-----");
        for (int i = top; i >= 0; i--) {
            System.out.println(items[i]);
        }
        System.out.println("------------------");
    }
}
