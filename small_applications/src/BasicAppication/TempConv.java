
package BasicAppication;

public class TempConv extends Calculator {
        public void ConvTemp() {

        System.out.println("What type of convert do you want?");
        System.out.println("Please press c for Fahrenheit to Celsius.");
        System.out.println("Please press f for Celsius to Fahrenheit.");

        char char2 = input.next().charAt(0);
        double numb3;

        if (char2 == 'c') {
            try {
                System.out.print("Enter Fahrenheit: ");
                numb3 = input.nextDouble();
                System.out.println("Celsius: " + (numb3 - 32) * 5 / 9);

            } 
            catch (Exception e) {
                System.out.println(e);
            }
        } 
        else {
            try {
                System.out.print("Enter Celsius: ");
                numb3 = input.nextDouble();
                System.out.println("Fahrenheit: " + (numb3 * 9 / 5) + 32);

            } 
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
