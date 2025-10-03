abstract class Shape {
    String name;
    Shape(String name) {this.name = name;}
    abstract double area();
    abstract void print();
    abstract void draw();
}

class Circle extends Shape {
    int radius;
    static final double PI = 3.14;
    Circle(String name,int radius) {super(name); this.radius = radius;}
    double area() {return PI * radius * radius;}
    void print() {
        System.out.println(super.name + "(" + Integer.toString(radius) + ") : " + Double.toString(area()));
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

class Triangle extends Shape {
    int base;
    int height;
    Triangle(String name, int base, int height) {
        super(name);
        this.base = base;
        this.height = height;
    }
    double area() {return 0.5 * base * height;}
    void print() {
        System.out.println(super.name + "(" + Integer.toString(base) + ", " + Integer.toString(height) + ") : " + Double.toString(area()));
    }
    void draw() {
        System.out.println("     *     ");
        System.out.println("    * *    ");
        System.out.println("   *   *   ");
        System.out.println("  *     *  ");
        System.out.println(" *       * ");
        System.out.println("* * * * * *");
    }
}

class Square extends Shape {
    int side;
    Square(String name, int side) {super(name); this.side = side;}
    double area() {return side * side;}
    void print() {
        System.out.println(super.name + "(" + Integer.toString(side) + ") : " + Double.toString(area()));
    }
    void draw() {
        System.out.println("* * * * * *");
        System.out.println("*         *");
        System.out.println("*         *");
        System.out.println("*         *");
        System.out.println("*         *");
        System.out.println("* * * * * *");
    }
}

class Rectangle extends Square {
    int length;
    int width;
    Rectangle(String name, int length, int width) {
        super(name, length);
        this.length = length;
        this.width = width;
    }
    double area() {return length * width;}
    void print() {
        System.out.println(super.name + "(" + Integer.toString(length) + ", " + Integer.toString(width) + ") : " + Double.toString(area()));
    }
}

class ListNode {
    Shape info;
    ListNode next;
    ListNode(Shape info, ListNode next) {
        this.info = info;
        this.next = next;
    }
}

class Picture {
    ListNode head;
    Picture() {head = null;}
    void add(Shape sh) {head = new ListNode(sh, head);}
    void printAll() {
        for (ListNode p = head; p != null; p = p.next) {
            p.info.print();
        }
    }
    void drawAll() {
        for (ListNode p = head; p != null; p = p.next) {
            p.info.draw();
        }
    }
    double totalArea() {
        double area = 0;
        for (ListNode p = head; p != null; p = p.next) {
            area += p.info.area();
        }
        return area;
    }
}

public class mainClass extends Picture{
    public static void main(String[] args) {
        Picture pic = new Picture();
        pic.add(new Triangle("SecondTriangle", Integer.parseInt(args[0]) - 1, Integer.parseInt(args[1]) - 1));
        pic.add(new Triangle("FirstTriangle", Integer.parseInt(args[0]), Integer.parseInt(args[1])));
        pic.printAll();
    }
}