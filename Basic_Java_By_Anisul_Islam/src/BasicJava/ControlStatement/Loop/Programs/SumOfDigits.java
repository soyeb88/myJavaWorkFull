package BasicJava.ControlStatement.Loop.Programs;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, remainder, result = 0;
        System.out.println("Enter any number: ");
        num = input.nextInt();
        
        while (num!=0) {
            remainder = num%10;
            result = result + remainder; 
            num = num/10;
        }
        System.out.println("Sum of digits: " + result);
    }
}
