package BasicJava;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        /*
            if you take many different input and one of this input.next(); method, 
            then you caanot take two words with space.
        */
        
        Scanner input = new Scanner(System.in); //press control enter to imprt Scanner class

        String str;
        //to use nextLine method you need to use it first before any other input method
        System.out.println("Please Enter a string value");
        str = input.nextLine();
        System.out.println("Your give a string value: " + str);


        System.out.println("Please Enter a string value");
        str = input.next();
        System.out.println("Your give a string value: " + str);

        int intNum;
        System.out.println("Please Enter a integer value");
        intNum = input.nextInt();
        System.out.println("Your give a integer value: " + intNum);

        double dblNum;
        System.out.println("Please Enter a double value");
        dblNum = input.nextDouble();
        System.out.println("Your give a double value: " + dblNum);
        
        float fl;
        System.out.println("Please Enter a float value");
        fl = (float) input.nextDouble();
        System.out.println("Your give a float value: " + fl);

        char ch;
        System.out.println("Please Enter a Character value");
        ch = input.next().charAt(0);
        System.out.println("Your give a Character value: " + ch);
        
        short sh;
        System.out.println("Please Enter a short value");
        sh = input.nextShort();
        System.out.println("Your give a short value: " + sh);
        
        long ln;
        System.out.println("Please Enter a long value");
        ln = input.nextLong();
        System.out.println("Your give a long value: " + ln);
        
        byte b;
        System.out.println("Please Enter a byte value");
        b = input.nextByte();
        System.out.println("Your give a byte value: " + b);
        
        boolean bl;
        System.out.println("Please Enter a boolean value");
        bl = input.nextBoolean();
        System.out.println("Your give a boolean value: " + bl);

    }

}
