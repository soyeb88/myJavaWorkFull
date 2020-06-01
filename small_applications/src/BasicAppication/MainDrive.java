package BasicAppication;

import java.util.Scanner;

public class MainDrive {

    public static void main(String[] args) {

        System.out.println("===========================");
        System.out.println("== WellCome to Main Menu ==");
        System.out.println("===========================");

        Scanner input = new Scanner(System.in);

        char charMain;

        do {

            System.out.println("Please select one: ");
            System.out.println("press 'b' for Basic Calculation");
            System.out.println("press 's' for Daily Neccessay tools");
            System.out.println("press 'x' for Exit the program");
            System.out.println("press 'h' for help");
            System.out.print("\n\n");

            charMain = input.next().charAt(0);

            if (charMain == 'x') {
                System.out.println("You Exit the program");
                break;
            } else if (charMain == 'b') {
                BasicCalculation bs = new BasicCalculation();
            } else if (charMain == 's') {
                TempConv tm = new TempConv();
                tm.ConvTemp();
            } else {
                System.out.println("Ivalid input. Please press h for help");
            } 

        } while (true);
    }
}
