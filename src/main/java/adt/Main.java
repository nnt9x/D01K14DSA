package adt;


public class Main {
    public static void main(String[] args) {
        Stack<Integer> s1 = new GenericStack<>(100);
        s1.push(10);
        s1.push(20);
        s1.push(50);
//        s1.display();

        Stack<Double> s2 = new GenericStack<>(20);
        s2.push(10.5);
        s2.push(30.5);
        s2.push(1.5);
//        s2.display();

        Stack<Stack> s3 = new GenericStack<>(10);

        s3.push(s2);
        s3.push(s1);
        s3.display();

    }
}
