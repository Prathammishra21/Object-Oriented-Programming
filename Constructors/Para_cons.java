package Constructors;

public class Para_cons {

    int num1;
    int num2;
    Para_cons(int a, int b){
        num1= a;
        num2 = b;
    }

    public static void main(String[] args) {
        Para_cons obj1 = new Para_cons(10,20);
        Para_cons obj2 = new Para_cons(100,200);

        System.out.println("Object 1");
        System.out.println("Num 1: "+obj1.num1);
        System.out.println("Num 2: "+obj1.num2);

        System.out.println("Object 2");
        System.out.println("Num 1: "+obj2.num1);
        System.out.println("Num 2: "+obj2.num2);
    }
}
