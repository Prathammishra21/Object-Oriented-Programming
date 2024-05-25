package Abstraction;

abstract class bike {
    public abstract void name();
    public void speed(){
        System.out.println("My bike goes 300km/hr ...");
    }
}

class Gixxer extends bike{
    public void name(){
        System.out.println("I have a gixxer bike ...");
    }
}

class Main_01 {
    public static void main(String[] args) {
        Gixxer gxr = new Gixxer();
        gxr.name();
        gxr.speed();
    }
}

