package BasicJava.ControlStatement.Loop.Programs;

import java.util.Scanner;

public class Fibonicci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbers,first,second,fib;
        
        System.out.print("How many Fibonicci numbers you want: ");
        numbers = input.nextInt();
        
        first = 0;
        second = 1;
        
        
        System.out.print(first + " " + second);
        for (int i = 3; i <= numbers; i++) {
            fib = first + second;
            System.out.print(" " + fib);
            
            first = second;
            second = fib;
        }
        
        System.out.println("");
    }
}
