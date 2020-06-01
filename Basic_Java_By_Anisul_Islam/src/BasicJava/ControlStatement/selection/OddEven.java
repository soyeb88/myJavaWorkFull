package BasicJava.ControlStatement;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        number = input.nextInt();
        
        if((number%2)==0){
            System.out.println("You put even number.");
        }
        else{
            System.out.println("You put odd number.");
        }
    }
}
