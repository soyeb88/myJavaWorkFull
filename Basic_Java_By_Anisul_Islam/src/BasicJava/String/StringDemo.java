package BasicJava.String;

public class StringDemo {

    public static void main(String[] args) {
        //2 methods to create String
        String s1 = "Soyeb Ahmed"; //direct assign value
        String s2 = new String("Soyeb Ahmed"); // create an object an assign value
        
        //show the result of variable s1 and object instance s2        
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        
        //def: String is a collection of Characters
        char[] s3 = {'S', 'o', 'y', 'e', 'b'}; //create array and take characters
        System.out.println("s3: " + s3);//then create String
        

        //to get the length of the String
        int len = s1.length(); //use ob.length() funtcyion
        System.out.println("Length of s1 = " + len); // show the result

        //Not equal because it doesn't take the value of s1 and s2
        if (s1 == s2) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
        
        //equal because it takes the value of s1 and s2
        if (s1.equals(s2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
        
        /*
            equal because it take the value of s1 and 
            check if any sequential character of s2 exists on s1
        */
        if (s1.contains("oy")) { // ob.contains() methods to check any of the sequential character 
                                 //exists on s1 variable
            System.out.println("Equal"); //result should be equal since oy exists inside s1 variable
        } else {
            System.out.println("Not Equal");
        }
        
        //to ingnore Case sensative 
        boolean con = s1.equalsIgnoreCase("soyeb ahmed"); //ob.equalsIgnoreCase(String);
        System.out.println("con = " + con); //it matches any Strings with another Strings and returns
                                            //boolean value but ignore the case sensative
        
        //check whether the string is empty or not
        String s = "";
        boolean b = s.isEmpty();
        System.out.println("b is emtpy = " + b);
        
        s = "a";
        b = s.isEmpty();
        System.out.println("b is emtpy = " + b);
    }
}
