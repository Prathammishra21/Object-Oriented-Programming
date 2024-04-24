package Access_modifier;

public class All_modifiers {
    private int age;
     String name;
    public All_modifiers(){
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name =name;
    }
    public String getName(String name){
        return name;
    }
    public void printDetails(){
        System.out.println("My name is "+name+" and I am "+age+" years old");
    }

    public static void main(String[] args) {
        All_modifiers obj = new All_modifiers();
        obj.setAge(12);
        obj.setName("Pratham");
        obj.printDetails();
    }
}
