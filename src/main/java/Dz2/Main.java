package Dz2;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape(3,5);
        Shape shape1 = new Shape(6,8);
        System.out.println(shape.getType());
        System.out.println(shape1.getType());
        Rectangle rectangle = new Rectangle(4,5);
        System.out.println(rectangle.getType() + " " + rectangle.getPerimeter());
        Circle circle = new Circle(4,9);
        System.out.println(circle.getType() + " " + circle.getArea());
    }
}