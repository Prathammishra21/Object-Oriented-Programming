package Abstraction.Questions;

abstract class bike {
    public abstract void name();
    public void speed(){
        System.out.println("My bike goes 300km/hr ...");
    }
}

class Hayabusa extends bike{
    public void name(){
        System.out.println("I have a Hayabusa ...");
    }
}

class Main_01 {
    public static void main(String[] args) {
      Hayabusa hayabusa = new Hayabusa();
      hayabusa.speed();
      hayabusa.name();
    }
}

