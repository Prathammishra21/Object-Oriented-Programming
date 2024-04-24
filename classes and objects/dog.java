public class dog{
    String breed;
    int age;
    String color;

    public void setbreed(String breed){
        this.breed = breed;
    }
    
    public void setage(int age){
        this.age = age;
    }

    public void setcolor(String color){
        this.color = color;
    }

    public void printDetails(){
        System.out.println("Dog details: ");
        System.out.println(this.breed);
        System.out.println(this.age);
        System.out.println(this.color);
    }

    public static void main(String [] args) {
        dog Doggy = new dog();
        Doggy.setbreed("lhasa");
        Doggy.setage(12);
        Doggy.setcolor("Cream");
        Doggy.printDetails();
    }
}