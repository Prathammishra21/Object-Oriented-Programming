package Polymorphism;

public class numbers {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        numbers obj = new numbers();

        obj.sum(8, 7);
        obj.sum(4, 6, 7);

    }
}
