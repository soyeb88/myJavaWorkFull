package BasicJava.ControlStatement;

import java.util.Scanner;

public class SelectionStatement {
    public static void main(String[] args) {
        
        int num1,num2;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter first number: ");
        num1 = input.nextInt();
        System.out.print("Please enter second number: ");
        num2 = input.nextInt();
        
        if(num1>num2){
            System.out.println("First number is bigger than second number.");
        }
        else if(num1<num2){
            System.out.println("Second number is bigger than first number.");
        }
        else{
            System.out.println("Both number is equal.");
        }
    }
}
