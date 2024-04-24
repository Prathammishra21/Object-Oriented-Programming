package Inheritance;

import Constructors.Main;

public class One{
    public void printOne(){
        System.out.println("Printing method one...");
    }

    protected void OneS() {
    }
}

class two extends One{
    public static void main(String[] args) {
        two obj =new two();
        obj.printOne();
    }
}
