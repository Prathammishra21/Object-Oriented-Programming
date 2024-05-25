package Abstraction;

abstract class car{
    public abstract void speed();
    public void horn(){
        System.out.println("peeeeeeeee");
    }
}

class Maybach extends car{
    public void speed() {
        System.out.println("weeeeeeee");
    }
}
class Main {
    public static void main(String[] args) {
        Maybach mymb = new Maybach();
        mymb.speed();
        mymb.horn();
    }
}

