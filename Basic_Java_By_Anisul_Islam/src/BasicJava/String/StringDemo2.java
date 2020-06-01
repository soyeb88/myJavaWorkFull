package BasicJava.String;

public class StringDemo2 {

    public static void main(String[] args) {
        //Concatination
        String firstName = "Soyeb";
        String lastName = " Ahmed";

        String fullName = firstName.concat(lastName);
        System.out.println("method-1 concatination: " + firstName + lastName + 25); //method-1
        System.out.println("Method-2 concatination: " + fullName); //method-2

        //convert Upper Case
        String upperCase = fullName.toUpperCase();
        System.out.println("Upper Case: " + upperCase);

        //Convert Lower Case
        String lowerCase = fullName.toLowerCase();
        System.out.println("Upper Case: " + lowerCase);

        //match whether String start with given characters or character 
        boolean b = firstName.startsWith("S");
        System.out.println("Start the String with S: " + b);

        b = firstName.startsWith("Soy");
        System.out.println("Start the String with Soy: " + b);

        b = firstName.startsWith("b");
        System.out.println("Start the String with b: " + b);

        //match whether String ends with given characters or character
        b = lastName.endsWith("d");
        System.out.println("Ends the String with d: " + b);
        b = lastName.endsWith("med");
        System.out.println("Ends the String with Soy: " + b);

        b = lastName.startsWith("b");
        System.out.println("Ends the String with b: " + b);
        
        //create array with String
        String[] names = {"Soyeb","Nasir","Zahir"};
        
        //show result using for each loop
        for (String x: names) {
            System.out.print(x+" ");
        }
        
        System.out.println();
        
        //show result using for each loop
        for (int i=0; i<3; i++) {
            System.out.print(names[i]+" ");
        }
    }
}
