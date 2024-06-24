package Abstraction.Questions;

public abstract class Animal {
    public abstract void sound();
}
class Lion extends Animal{
    @Override
    public void sound() {
        System.out.println("Lion roars...");
    }
}

class Tiger extends Animal{
    @Override
    public void sound(){
        System.out.println("Tiger growls...");
    }
}

class Main_1{
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal tiger = new Tiger();
        lion.sound();
        tiger.sound();
    }
}
