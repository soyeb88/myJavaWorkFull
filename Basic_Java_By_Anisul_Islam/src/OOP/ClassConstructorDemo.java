package OOP;

public class ClassConstructorDemo {

    String gender, name, phone;

    //default Constructor
    ClassConstructorDemo() {
        System.out.println("No Value");
        System.out.println("\n\n");

    }

    //Parametarized Constructor
    ClassConstructorDemo(String n, String g, String p) {
        name = n;
        gender = g;
        phone = p;
    }

    //Overloading Constructor
    ClassConstructorDemo(String n, String g) {
        name = n;
        gender = g;
    }

    void displayInformation() {

        System.out.println("name: " + name);
        System.out.println("gender: " + gender);
        System.out.println("phone: " + phone);
        System.out.println("\n\n");
    }
    
    int square(int x){
         return x*x;
    }
}
