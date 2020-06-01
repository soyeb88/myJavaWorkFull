package BasicJava.ControlStatement.Loop.Programs;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, remainder, result = 0, temp;
        System.out.print("Enter any number: ");
        num = input.nextInt();
        
        temp = num;
        
        while (temp!=0) {
            remainder = temp%10;
            result =   result + remainder*remainder*remainder; 
            temp = temp/10;
        }
        
        if (result == num) {
             System.out.println(num + " is Armstrong Number");
        }
        else{
            System.out.println(num + " is not Armstrong Number");
        }
       
    }
}