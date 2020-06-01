package BasicJava.Operator;

import java.util.Scanner;

public class MeasurementsOfDifferentShapeAndTemperureCoverter {

    public static void main(String[] args) {
        
        int x, y;
        double z,m,n,result;
        
        //Calculate Square
        Scanner input = new Scanner(System.in);
        System.out.println("Squar Formula: ");
        System.out.print("Length of Side: ");

        x = input.nextInt();

        System.out.println("Peremeter of square: " + 4 * x);
        System.out.println("Area of square: " + x * x);

        //Calculate Rectangle
        System.out.println("Rectangle Formula: ");
        System.out.print("Length of Side: ");
        x = input.nextInt();
        System.out.print("Width of Side: ");
        y = input.nextInt();

        System.out.println("Peremeter of Rectangle: " + 2 * (x + y));
        System.out.println("Area of Rectangle: " + x * y);

        //Calculate Triangle
        System.out.println("Triangle Formula: ");

        System.out.print("Length of Side1: ");
        z = input.nextDouble();
        System.out.print("Length of Side2: ");
        m = input.nextDouble();
        System.out.print("Length of Side3: ");
        n = input.nextDouble();
        System.out.println("Peremeter of Triangle: " + (z + m + n));

        System.out.print("Length of base: ");
        m = input.nextDouble();
        System.out.print("Length of height: ");
        n = input.nextDouble();
        System.out.println("Area of Triangle: " + .5 * m * n);
        
        //Calculate Triangle
        System.out.println("Circle Formula: ");
        System.out.print("Redius: ");
        
        z = input.nextDouble();
        result = 2 * Math.PI * z;
        
        System.out.printf("Peremeter of circle: %.2f \n", result);
        
        result = Math.PI * (z * z);
        System.out.printf("Area of circle: %.2f \n", result);
        
        //Convert Celcius to Ferhenheight
        System.out.println("Celcius to Ferhenheight ");
        System.out.print("Celcius: ");
        
        z = input.nextDouble();
        result = ((9/5)*z + 32);
        System.out.printf("Ferhenheight is: %.2f \n", result);
        
        //Convert Ferhenheight to Celcius
        System.out.println("Ferhenheight to Celcius");
        System.out.print("Ferhenheight: ");
        
        z = input.nextDouble();
        result = (z - 32)*5/9;
        System.out.printf("Celcius is: %.2f", result);

    }
}
