package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();

        Triangle triangle = new Triangle();
        triangle.area();
        shapes.area();
    }
}
