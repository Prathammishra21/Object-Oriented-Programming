package Polymorphism;

public class Bike {
    protected void run() {
        System.out.println("running");
    }

    class Hayabusa extends Bike {
        @Override
        protected void run() {
            System.out.println("Running at 180km/hr...");
        }
    }

    class Kawasaki extends Bike {
        @Override
        protected void run() {
            System.out.println("Running at the speed of 210km/hr...");
        }
    }

    public static void main(String[] args) {
        Hayabusa obj1 = new Bike().new Hayabusa();
        obj1.run();
        Kawasaki obj2 = new Bike().new Kawasaki();
        obj2.run();
    }
}
