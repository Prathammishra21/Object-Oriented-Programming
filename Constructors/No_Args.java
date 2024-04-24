package Constructors;

public class No_Args {
    int num1;
    int num2;
    No_Args(){
         num1 = -1;
         num2 = -1;
    }

    public static void main(String[] args) {
        No_Args obj_x = new No_Args();
        System.out.println("First number: "+obj_x.num1);
        System.out.println("Second number: "+obj_x.num2);
    }
}

