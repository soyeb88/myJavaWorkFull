package BasicJava.Operator;

import java.util.Scanner;

public class ConditionalOperator {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num1, num2, larger;
        System.out.print("Enter any two number: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        
        larger = (num1>num2) ? num1 : num2; 
        System.out.println("Large Number: "+ larger);
    }
    
}
