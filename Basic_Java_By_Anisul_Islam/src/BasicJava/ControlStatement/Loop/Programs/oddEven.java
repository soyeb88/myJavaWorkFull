package BasicJava.ControlStatement.Loop;

import java.util.Scanner;

public class oddEven {

    public static void main(String[] args) {

        //sum of all numbers from 0 to 10
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println("The sum is " + sum);

        //sum of all numbers from user input m to user input n
        Scanner input = new Scanner(System.in);
        System.out.print("Please Ente first number: ");
        int m = input.nextInt();
        System.out.print("Please Enter last number: ");
        int n = input.nextInt();
        sum = 0;

        for (int i = m; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("The sum is " + sum);

        //sum of all numbers from user input m to user input n
        System.out.print("Please Ente first number: ");
        m = input.nextInt();
        System.out.print("Please Enter last number: ");
        n = input.nextInt();
        sum = 0;

        //sum of all numbers from user input m to user input n all even number
        for (int i = m; i <= n; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
                System.out.println("Even Numbers " + i);
            }
        }
        System.out.println("The sum of all even numbers are " + sum);

        //sum of all numbers from user input m to user input n all even number
        System.out.print("Please Ente first number: ");
        m = input.nextInt();
        System.out.print("Please Enter last number: ");
        n = input.nextInt();
        sum = 0;

        for (int i = m; i <= n; i++) {
            if (i % 2 == 1) {
                sum = sum + i;
                System.out.println("Odd Numbers " + i);
            }
        }
        System.out.println("The sum of all odd numbers are " + sum);
    }
}
