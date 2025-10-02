abstract class Shape {
    String name;
    Shape(String newName) {name = newName;}
    void print() {
        System.out.print(name);
        System.out.print(" ( ");
        System.out.print(" ) ");
        System.out.print(" : ");
        System.out.print(Double.toString(area()));;
    }
    void draw() {System.out.println("Shape.draw()");}
    double area() {return 0.0;}
}

/*public class mainClass {
    public static void main(String[] args) {
    Shape circle = new Shape("Circle");
    }
}*/