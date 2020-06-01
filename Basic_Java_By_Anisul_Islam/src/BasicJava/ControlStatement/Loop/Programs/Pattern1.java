package BasicJava.ControlStatement.Loop.Programs;

import java.util.Scanner;

public class Pattern1 {

    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter number to see pattern 1: ");

        num = input.nextInt();

        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        System.out.print("Please Enter number to see pattern 2: ");

        num = input.nextInt();

        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }

        System.out.print("Please Enter number to see pattern 3: ");

        num = input.nextInt();

        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                if ((col % 2) == 0) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(1 + " ");
                }
            }
            System.out.println();
        }

        System.out.print("Please Enter number to see pattern 4: ");

        num = input.nextInt();

        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                if ((row % 2) == 0) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(1 + " ");
                }
            }
            System.out.println();
        }

        System.out.print("Please Enter number to see pattern 5: ");

        num = input.nextInt();
        char a;

        for (int row = 1; row <= num; row++) {
            a = 'A';
            for (int col = 1; col <= row; col++) {
                System.out.print(a++ + " ");
            }
            System.out.println();
        }

        System.out.print("Please Enter number to see pattern 6: ");

        num = input.nextInt();

        a = 'A';
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(a + " ");
            }
            a++;
            System.out.println();
        }

        System.out.print("Please Enter number to see pattern 7: ");

        num = input.nextInt();

        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.print("Please Enter number to see pattern 8: ");

        num = input.nextInt();

        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
