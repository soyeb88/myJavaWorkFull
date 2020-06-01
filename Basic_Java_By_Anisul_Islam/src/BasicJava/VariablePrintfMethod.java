package BasicJava;

public class VariablePrintfMethod {
    public static void main(String[] args) {
        /*
            three types of print method
        */ 
        
        int x = 2;
        
        System.out.print("Do not create new line. "); //after this statement do not create new line
        System.out.println("My First Application"); // after this statement creat new line
        System.out.printf("the value of x is %x. \n", x); // after this statement creat assigned x value showed up
                                                      //do not create new line
        
        /*
            - VariablePrintfMethod must be (A-Z) or (a-z) or _ or $ should be used. You can combined this character.
            - You cannot start variable with digit.
            - You cannot use any keyword or function name as variable.
            - You cannot give any space on variable
        */
        
        //Different Data Type
        
        int in = 10;
        double db = 10.2;
        float fl = 10.2f;
        boolean b = true;
        char c = 's';
        short s = 100;
        long l = 100000;
        
        
        
        System.out.println(in);
        System.out.println(db);
        System.out.println(fl);
        System.out.println(b);
        System.out.println(c);
        System.out.println(s);
        System.out.println(l + "\n\n");
        
        //Printf Method
         
        System.out.printf("int in = %d \n", in);
        System.out.printf("double db = %.3f \n", db);  //create three decimal place %.3f
        System.out.printf("float fl = %.1f \n", fl); //create one decimal place %.1f
        System.out.printf("boolean in = %b \n", b);
        System.out.printf("char in = %c \n", c);
        System.out.printf("long in = %d \n", l);
        System.out.printf("short in = %s \n", s);
        
        
    }
}
