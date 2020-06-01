package BasicJava.Operator;

import java.util.Scanner;

public class LogicalOperator {

    public static void main(String[] args) {
        char ch;
        int num1, num2, num3;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any character: ");
        ch = input.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }

        System.out.print("Enter all number 1, 2 and 3: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        if (num1 == 1 && num2 == 2 && num3 == 3) {
            System.out.println("Thank you");
        } else {
            System.out.println("Denied");
        }

        System.out.print("Enter any letter: ");
        ch = input.next().charAt(0);
        if (ch>='a' && ch<='z') {
            System.out.println("You enter small letter");
        } else if(ch>='A' && ch<='Z') {
            System.out.println("You enter capital letter");
        }
        else{
            System.out.println("You don't put any letter");
        }

        System.out.print("Enter any number except 1: ");
        num1 = input.nextInt();
        if (num1 != 1) {
            System.out.println("Thank you");
        } else {
            System.out.println("Denied");
        }
    }
}
