package OOP;

public class Test {
    public static void main(String[] args) {
        //Method 1
        ClassDemo teacher1; //declare object
        teacher1 = new ClassDemo(); //create object
        
        //Method 2
        ClassDemo teacher2 = new ClassDemo();
        
        teacher1.name = "Soyeb";
        teacher1.gender = "Male";
        teacher1.phone = "01680550309";
        
        System.out.println("Name: " + teacher1.name);
        System.out.println("Name: " + teacher1.gender);
        System.out.println("Name: " + teacher1.phone);
        
        teacher2.name = "Kanon";
        teacher2.gender = "Male";
        teacher2.phone = "01680450349";
        
        System.out.println();
        
        System.out.println("Name: " + teacher2.name);
        System.out.println("Name: " + teacher2.gender);
        System.out.println("Name: " + teacher2.phone);
    }
}
