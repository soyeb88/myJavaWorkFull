package DataStructure.Array;

import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double sum = 0;
        double[] number = new double[5];

        System.out.print("Enter 5 numbers: ");

        /*
            number[0] = input.nextDouble();
            number[1] = input.nextDouble();
            number[2] = input.nextDouble();
            number[3] = input.nextDouble();
            number[4] = input.nextDouble();
         */
        //Method 1: Use for loop
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextDouble();
        }

        /*   sum = number[0] + number[1] + number[2] +number[3] + number[4];
             System.out.println("Sum of 5 numbers: " + sum);
         */
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        //sum of five numbers
        System.out.println("sum of 5 numbers: " + sum);

        //Average of 5 numbers
        double average = sum / number.length;
        System.out.println("Average of 5 numbers: " + average);

        double max = number[0];
        double min = number[0];
        for (int i = 0; i < number.length; i++) {
            if (max < number[i]) {
                max = number[i];
            }
            if (min > number[i]) {
                min = number[i];
            }
        }
        System.out.println("Maximum Number: " + max);
        System.out.println("Minimum Number: " + min);

        //Method 2: Use for each loop
        String[] name = {"Soyeb", "Nasir", "Zahir"};

        for (String x : name) {
            System.out.print(x + " ");
        }
        
        System.out.println("");

        int[] num = {1, 2, 4};
        int s = 0;
        
        for (int y : num) {
            s = s + y;
        }
        System.out.println("Sum of num: " + s);

    }
}
