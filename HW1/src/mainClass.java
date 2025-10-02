abstract class Shape {
    String name;
    Shape(String newName) {name = newName;}
    abstract void print();
    abstract void draw();
    abstract double area();
}

class Circle extends Shape {
    double radius;
    static final double PI = 3.14;
    Circle(double newRadius) {
        super("Circle");
        radius = newRadius;
    }
    double area() {return PI * radius * radius;}
    void print() {
        System.out.print(super.name);
        System.out.print(" ( ");
        System.out.print(radius);
        System.out.print(" ) ");
        System.out.print(" : ");
        System.out.print(Double.toString(area()));;
    }
    void draw() {
        System.out.print("*");
    }
}

/*public class mainClass {
    public static void main(String[] args) {
    Shape circle = new Shape("Circle");
    }
}*/