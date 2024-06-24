package Inheritance.Questions;

public class Shape {
    public double getArea(){
        return 0.0;
    }
}

class Rectangle extends Shape{
    private double length;
    private double breadth;
    public Rectangle(double length , double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    public double getArea(){
        return length*breadth;
    }
}

class Main3{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(22,12);
        double area = rectangle.getArea();
        System.out.println("The area of rectangle is: "+area);
    }
}
