package BasicAppication;


public class BasicCalculation extends Calculator {
    
    BasicCalculation(){
        TempConv temp = new TempConv();
        //Create Console
        System.out.println("=====================================");
        System.out.println("== WellCome to My Basic Calculator ==");
        System.out.println("=====================================");

        char char1;
        
        do {

            System.out.println("Please select one: ");
            System.out.println("press 'a' for add");
            System.out.println("press 's' for substraction");
            System.out.println("press 'm' for multiplication");
            System.out.println("press 'd' for division");
            System.out.print("");
            
          
            char1 = input.next().charAt(0);

            if ((char1 != 'x') && (char1 != 'b') && (char1 != 'c') && (char1 != 'e')
                    && (char1 != 'f') && (char1 != 'g') && (char1 != 'h') && (char1 != 'i') && (char1 != 'j') 
                    && (char1 != 'k') && (char1 != 'l') && (char1 != 'n') && (char1 != 'o') && (char1 != 'p') 
                    && (char1 != 'q') && (char1 != 'r') && (char1 != 'u') && (char1 != 'v') && (char1 != 'w')
                    && (char1 != 'y') && (char1 != 'z')) {
                switch (char1) {
                    case 'a':
                        Add();
                        break;
                    case 's':
                        sub();
                        break;
                    case 'm':
                        mult();
                        break;
                    case 'd':
                        div();
                        break;
                    case 't':
                        break;
                    default:
                        break;
                }

            } else if (char1 == 'h') {
                System.out.println("*** press 'x' for exit the program. ***");
                System.out.println("*** press 'h' for guid ***\n");
            } else if (char1 == 'x') {
                System.out.println("You Exit the program.");
                break;
            } else {
                System.out.println("You do not give any number. Please press h for help. ");
                System.out.println("");
                System.out.println("");
            }
        } while (true);
    }

    public void Add() {
        cal();
        System.out.println("Sum of two digits: " + (numb1 + numb2));
    }

    public void sub() {
        cal();
        System.out.println("Substraction of two digits: " + (numb1 - numb2));
    }

    public void mult() {
        cal();
        System.out.println("Multiplication of two digits: " + (numb1 * numb2));

    }

    public void div() {
        cal();
        System.out.println("Division of two digits: " + (numb1 / numb2));

    }

}
