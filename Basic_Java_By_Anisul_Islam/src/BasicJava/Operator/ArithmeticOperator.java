package BasicJava.Operator;

import java.util.Scanner;

public class ArithmeticOperator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, result;
        
        System.out.print("Enter any two number: ");
        
        num1 = input.nextInt();
        num2 = input.nextInt();
        
        //num1 = 20;
        //num2 = 30;
        
        result = num1 + num2;
        System.out.println("Sum of two numbers: " + result);

        result = num1 - num2;
        System.out.println("Substraction of two numbers: " + result);

        result = num1 * num2;
        System.out.println("Multiplication of two numbers: " + result);

        double result2 = (double) num1 / num2;
        System.out.println("Division of two numbers: " + result2);

        result = num1 % num2;
        System.out.println("Reminder of two numbers: " + result);
    }
}
