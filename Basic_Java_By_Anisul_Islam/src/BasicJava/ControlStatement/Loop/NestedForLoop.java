package BasicJava.ControlStatement.Loop.Programs;

import java.util.Scanner;

public class NestedForLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1, num2;

        //for loop
        System.out.println("Eneter Any Number: ");
        num1 = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " X " + num1 + " = " + i * num1);
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");

        //nested for loop
        System.out.println("Eneter first Number: ");
        num1 = input.nextInt();
        System.out.println("Eneter last Number: ");
        num2 = input.nextInt();

        for (int i = num1; i <= num2; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(j + " X " + i + " = " + j * i);
            }
            System.out.println("");
        }
    }
}
