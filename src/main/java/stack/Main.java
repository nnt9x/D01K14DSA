package stack;

public class Main {
    public static void main(String[] args) {
        StackNumber stackNumber = new StackNumber(100);
        stackNumber.push(10);
        stackNumber.push(20);
        stackNumber.push(30);
        stackNumber.display();
        // Lay ra phan tu tren cung
        System.out.println(stackNumber.pop());
        stackNumber.display();

        System.out.println(stackNumber.pop());
        stackNumber.display();

    }
}
