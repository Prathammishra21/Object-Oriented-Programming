package Abstraction.Questions;

abstract class car{
    public abstract void speed();
    public void horn(){
        System.out.println("Po Po");
    }
}

class BMW extends car{
    public void speed() {
        System.out.println("It is 300km/hr");
    }
}
class Main {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.speed();
        bmw.horn();
    }
}

