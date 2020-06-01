package BasicJava.ControlStatement;

import java.util.Scanner;

public class RecursionDemo {
    int factorial(int num){
        if(num == 1){
            return 1;
        }
        else{
            return num*factorial(num - 1);
        }
    }
    
    public static void main(String[] args) {
        //Factorial
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter any number to get the recursion: ");
        int number = input.nextInt();
        
        RecursionDemo recursion = new RecursionDemo();
        int fact = recursion.factorial(number);
        System.out.println("Factorial of 5: " + fact);
    }
}
