package Polymorphism;

interface vegetarian{}
public class Animal{
}
class deer extends Animal implements vegetarian{
    public static void main(String[] args) {
        deer d = new deer();
        Animal a = d;
        vegetarian v = d;
        System.out.println(true);
        System.out.println(true);
        System.out.println(true);
    }
}
