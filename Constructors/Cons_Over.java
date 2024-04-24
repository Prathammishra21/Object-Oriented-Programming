package Constructors;

public class Cons_Over {
    String name;
    int age;
    static String BREED = "Bulldog";

    Cons_Over(){
        this.name = "Unknown";
        this.age = 0;
    }

    Cons_Over(String name, int age){
        this.name = name;
        this.age =age;
    }
    public void printDetails(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
    }

    public static void main(String[] args) {
        Cons_Over obj1 = new Cons_Over();
        obj1.printDetails();
        Cons_Over obj2 =new Cons_Over("Google",12);
        obj2.printDetails();

    }
}
