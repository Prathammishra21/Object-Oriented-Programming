package Inheritance;

class Calculation {
    int c;
    public void addition(int a,int b){
        c = a+b;
        System.out.println("The sum of a and b is: "+c);
    }

    public void subtraction(int a,int b){
        c=a-b;
        System.out.println("The difference between a and b is: "+c);
    }
}

class My_Calculation extends Calculation{
    public void multiplication(int a,int b){
        c= a*b;
        System.out.println("The multiplication of a and b is: "+c);
    }

    public static void main(String[] args) {
     int a =10;
     int b =20;
     My_Calculation demo = new My_Calculation();
     demo.addition(a,b);
     demo.subtraction(a,b);
     demo.multiplication(a,b);
    }
}

