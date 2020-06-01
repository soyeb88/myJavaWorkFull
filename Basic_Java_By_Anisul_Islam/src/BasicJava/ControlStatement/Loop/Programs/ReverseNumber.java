package BasicJava.ControlStatement.Loop.Programs;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, remainder, result = 0;
        System.out.print("Enter any number: ");
        num = input.nextInt();
        
        while (num!=0) {
            remainder = num%10;
            result = (result*10) + remainder; 
            num = num/10;
        }
        System.out.println("Sum of digits: " + result);
    }
}
