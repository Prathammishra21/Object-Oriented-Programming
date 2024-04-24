package Polymorphism;

public class main {
   public int addition(int x, int y){
       return x+y;
   }
   public int addition(int x,int y,int z){
       return x+y+z;
   }
   public double addition(double x, double y){
       return x+y;
   }

    public static void main(String[] args) {
        main obj = new main();
        int res1 = obj.addition(56,76);
        System.out.println("Sum of x and y is: "+res1);
        int res2 = obj.addition(66,33,666);
        System.out.println("Sum of x,y and z is: "+res2);
        double res3 = obj.addition(37.23,84.59);
        System.out.println("Sum of x and y is: "+res3);
   }
}
