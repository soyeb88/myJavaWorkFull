package OOP.Abstract;

public class Rectangle extends Shape{
    //dim1, dim2, area()
    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }
    
    @Override
    void area(){
        double result = dim1 * dim2;
        System.out.println("Result of Rectangle: " + result);
    }
}
