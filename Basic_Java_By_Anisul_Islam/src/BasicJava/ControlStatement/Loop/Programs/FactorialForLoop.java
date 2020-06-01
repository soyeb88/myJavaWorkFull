package BasicJava.ControlStatement.Loop.Programs;

import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num, result=1;
        num = input.nextInt();
        for (int i = num; i > 1; i--) {
            result = result * i;
        }
        System.out.println("Factorial of " + num + " = " + result);
    }
}
