public class Animal_Attribute {
    String name = "lion";
    int age = 12;
    String color = "golden";

}
class Main {
    public static void main(String[] args) {
      Animal_Attribute animal = new Animal_Attribute();
        System.out.println("Before changing: ");
        System.out.printf(animal.name+" ");
        System.out.print(animal.age+" ");
        System.out.print(animal.color);

        animal.name ="cat";
        animal.age = 13;
        animal.color = "black";
        System.out.println();
        System.out.println("After changing: ");
        System.out.print(animal.name+" ");
        System.out.print(animal.age+" ");
        System.out.print(animal.color+" ");
    }
}