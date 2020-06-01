package BasicAppication;

import java.util.Scanner;

public class Calculator {    
    
    Scanner input = new Scanner(System.in);

    int numb1;
    int numb2;
    
    public void cal() {

        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter any first digit: ");
            numb1 = input.nextInt();

            System.out.print("Enter any second digit: ");
            numb2 = input.nextInt();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
