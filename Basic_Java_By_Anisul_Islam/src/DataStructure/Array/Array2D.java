package DataStructure.Array;

import java.util.Scanner;

public class Array2D {

    public static void main(String[] args) {
        //declare 2D array
        int[][] number = new int[3][3];

        //method 1: Create Array or initialize array
        number[0][0] = 10;
        number[0][1] = 20;
        number[0][2] = 30;
        number[1][0] = 40;
        number[1][1] = 50;
        number[1][2] = 60;
        number[2][0] = 70;
        number[2][1] = 80;
        number[2][2] = 90;

        /*
            System.out.println(number[0][0]);
            System.out.println(number[0][1]);
            System.out.println(number[0][2]);
            System.out.println(number[1][0]);
            System.out.println(number[1][1]);
            System.out.println(number[1][2]);
         */
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(number[row][col] + " ");
            }
            System.out.println();
        }

        //method 2: Create Array or initialize array
        int[][] arr1 = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};

        for (int row = 0; row < arr1.length; row++) {
            for (int col = 0; col < arr1[row].length; col++) {
                System.out.print(arr1[row][col] + " ");
            }
            System.out.println("");
        }

        //Matrix Part 1: Take User Input and make a matrix 
        Scanner input = new Scanner(System.in);

        int[][] A = new int[3][3];
        int[][] B = new int[3][3];

        //get user input
        System.out.println("Enter elements for matrix A: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("A[%d][%d] = ", i, j);
                A[i][j] = input.nextInt();
            }
        }

        //get user input
        System.out.println("Enter elements for matrix B: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("B[%d][%d] = ", i, j);
                B[i][j] = input.nextInt();
            }
        }

        //print user input as a matrix
        System.out.print("A = ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t " + A[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n\n");

        System.out.print("B = ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t " + B[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n\n");

        System.out.print("A+B = ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t " + (A[i][j] + B[i][j]));
            }
            System.out.println();
        }

        System.out.println("\n\n");

        System.out.print("A-B = ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t " + (A[i][j] - B[i][j]));
            }
            System.out.println();
        }

        System.out.println("\n\n");
        int sumofDiagonal = 0;
        int sumofUpperDiagonal = 0;
        int sumofLowerDiagonal = 0;

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row == col) {
                    sumofDiagonal = sumofDiagonal + A[row][col];
                }
                if (row < col) {
                    sumofUpperDiagonal = sumofUpperDiagonal + A[row][col];
                }
                if (row > col) {
                    sumofLowerDiagonal = sumofLowerDiagonal + A[row][col];
                }
            }
        }
        System.out.println("Sum of Diagonal of Matrix A: " + sumofDiagonal);
        System.out.println("Sum of Upper Diagonal of Matrix A: " + sumofUpperDiagonal);
        System.out.println("Sum of Lower Diagonal of Matrix A: " + sumofLowerDiagonal);
    }
}
