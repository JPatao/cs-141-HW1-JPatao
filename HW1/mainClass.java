abstract class Shape {
    String name();
    Shape(String newName) {name = newName;}
    void print() {
        System.out.println(this.name + " (" + this.x + ", " + this.y + ") : " + this.area);
    }
    abstract void draw();
    abstract double area();
}

