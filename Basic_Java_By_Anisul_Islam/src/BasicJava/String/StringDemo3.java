package BasicJava.String;

public class StringDemo3 {

    public static void main(String[] args) {

        String country = "Bangladesh is my country.";
        System.out.println(country);

        //find the character from String by index value and return the character
        char ch = country.charAt(2);
        System.out.println("ch = " + ch);

        //give the ASCI value of the return character
        int value = country.codePointAt(1);
        System.out.println("ASCI value of the character = " + value);

        //Position of given String "my"
        value = country.indexOf("my"); //take the String
        System.out.println("Position of given String \"my\"  = " + value);

        //Position of given Character 'n'at begining looking 
        value = country.indexOf('n'); //take the character
        System.out.println("Position of given Character \'n\'at begining looking = " + value);
        
        //Position of given Character 'n'at ending looking 
        value = country.lastIndexOf('n'); //take the character
        System.out.println("Position of given String \'n\' at ending looking = " + value);
        
        //trim method remove begining and ending space of the String
        //but cannot remove inside the space of the String
        country = "   My name is   Soyeb   ";
        String tr = country.trim();
        System.out.println(tr);
    }
}
