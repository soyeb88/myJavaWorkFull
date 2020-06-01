package BasicJava.ControlStatement.Loop.Programs;

import java.util.Scanner;

public class checkPrimesNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, count = 0, totalPrime = 0;
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter last number: ");
        num2 = input.nextInt();

        for (int i = num1; i <= num2; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println(i + " is a prime ");
                totalPrime++;
            } else {
                System.out.println(i + " is not prime ");
            }
            count = 0;
        }
        System.out.println("");
        System.out.println("Total Prime is: " + totalPrime);

    }
}
