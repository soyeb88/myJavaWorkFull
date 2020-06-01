package BasicJava;

import java.util.Scanner;

public class NumberConversion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        //convert decimal to binary, octal and hexadecimal
        int decimal;

        System.out.println("Please give a number: ");
        decimal = input.nextInt();

        String binary = Integer.toBinaryString(decimal);
        System.out.println("binary: " + binary);
        
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal: " + octal);
        
        String hexa = Integer.toHexString(decimal);
        System.out.println("Hexa Decimal: " + hexa);
        
        //convert binary, octal and hexadecimal to decimal 
        Integer dec = Integer.parseInt(binary, 2);
        System.out.println("Binary to decimal: " + dec);
        
        dec = Integer.parseInt(octal, 8);
        System.out.println("Octal to decimal: " + dec);
        
        dec = Integer.parseInt(hexa, 16);
        System.out.println("Octal to decimal: " + dec);
    }
}
