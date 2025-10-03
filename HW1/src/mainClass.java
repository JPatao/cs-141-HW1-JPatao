abstract class Shape {
    String name;
    Shape(String newName) {name = newName;}
    abstract double area();
    abstract void print();
    abstract void draw();
}

class Circle extends Shape {
    double radius;
    static final double PI = 3.14;
    Circle(String newName,double newRadius) {super(newName); radius = newRadius;}
    double area() {return PI * radius * radius;}
    void print() {
        System.out.println(super.name + "(" + Double.toString(radius) + ") : " + Double.toString(area()));
    }
    void draw() {
        System.out.println("    *  *    ");
        System.out.println(" *        * ");
        System.out.println("*          *");
        System.out.println("*          *");
        System.out.println(" *        * ");
        System.out.println("    *  *    ");
    }
}

public class mainClass {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{new Circle("FirstCircle", 10.5)};
        for (Shape s : shapes) {
            s.print();
            s.draw();
        }
    }
}