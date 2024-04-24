package Inheritance;

public class First {
    public void printFirst(){
        System.out.println("Print the first method...");
    }
}
class Two extends First {
    public void printTwo(){
        System.out.println("Print the second method...");
    }
}

class Three extends First{
    public void printThree(){
        System.out.println("Print the third method...");
    }
}

class main{
    public static void main(String[] args) {
        Two obj1 = new Two();
        Three obj2 = new Three();
        obj1.printFirst();
        obj2.printFirst();
    }
}
