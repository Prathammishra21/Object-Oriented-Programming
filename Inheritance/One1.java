package Inheritance;

public class One1 {
    public void printOne1(){
        System.out.println("Printing method one...");
    }
}

class Two2 extends One1{
    public void printTwo2(){
        System.out.println("Printing method two...");
    }
}

class Main extends Two2{
    public static void main(String[] args) {
       Main object = new Main();
       object.printOne1();
       object.printTwo2();
    }
}
