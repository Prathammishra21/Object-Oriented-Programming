package Inheritance;

class Animal {
public void dog(){
    System.out.println("Dog barks woof.");
}
public void cat(){
    System.out.println("Cat says meow.");
}
public void lion(){
    System.out.println("Lion roars very loud.");
}
}

class All_animals extends Animal{
    public static void main(String[] args) {
        Animal demo = new Animal();
        demo.dog();
        demo.cat();
        demo.lion();
    }
}
