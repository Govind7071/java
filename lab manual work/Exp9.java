
class Shape {
   
    void area() {
        System.out.println("Area of shape is undefined");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }


    @Override
    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    @Override
    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}

public class Exp9 {
    public static void main(String[] args) {

        Shape s;


        s = new Circle(5);
        s.area();  

        s = new Rectangle(4, 6);
        s.area(); 
    }
}