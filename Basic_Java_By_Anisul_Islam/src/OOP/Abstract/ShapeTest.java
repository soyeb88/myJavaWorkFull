package OOP.Abstract;

public class ShapeTest {

    public static void main(String[] args) {
        Shape shape;

        shape = new Rectangle(20, 10);
        shape.area();

        shape = new Triangle(20, 10);
        shape.area();

        shape = new Circle(20);
        shape.area();

    }
}
