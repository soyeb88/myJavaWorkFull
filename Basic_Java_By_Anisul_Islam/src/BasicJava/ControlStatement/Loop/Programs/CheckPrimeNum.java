package BasicJava.ControlStatement.Loop.Programs;

import java.util.Scanner;

public class CheckPrimeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,count=0;
        
        System.out.print("Enter any number: ");
        num = input.nextInt();
        
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                count++;
                break;
            }
        }
        
        if(count == 0){
            System.out.println(num + " is a prime number.");
        }
        else{
            System.out.println(num + " is not a prime number.");
        }
    }
}
