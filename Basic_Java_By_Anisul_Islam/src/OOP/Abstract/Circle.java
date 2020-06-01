package OOP.Abstract;

public class Circle extends Shape{
    //dim1, dim2, area()

    public Circle(double r) {
        super(r,r);
    }
    
    @Override
    void area(){
        double result = Math.PI * dim1 * dim2;
        System.out.printf("Shape of Circle: %.3f \n", result);
    }
}
