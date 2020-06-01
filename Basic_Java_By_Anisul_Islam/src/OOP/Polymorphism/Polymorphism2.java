package OOP.Polymorphism;

public class Polymorphism2 {

    static class Shape {

        double area() {
            System.out.print("Area of Shape: ");
            return 0;
        }
    }

    static class Rectangle extends Shape {

        //area()
        double length, width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        double area() {
            System.out.print("Area of Rectangle: ");
            return length * width;
        }
    }

    static class Triangle extends Shape{

        //area()
        double base, height;

        public Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        
        @Override
        double area() {
            System.out.print("Area of Triangle: ");

            return 0.5 * base * height;
        }
    }

    public static void main(String[] args) {
        Shape[] s = new Shape[3];
        
        //Shape shape = new Shape();
        //Rectangle rectangle = new Rectangle(20, 10);
        //Triangle triangle = new Triangle(20, 10);
        s[0] = new Shape();
        s[1] = new Rectangle(20, 10);
        s[2] = new Triangle(20, 10);
        
        //System.out.println(shape.area());
        //System.out.println(rectangle.area());
        //System.out.println(triangle.area());
        
        /*
            System.out.println(s[0].area());
            System.out.println(s[1].area());
            System.out.println(s[2].area());
        */
        
        for (int i = 0; i < 3; i++) {
            System.out.println(s[i].area());
        }

    }
}
