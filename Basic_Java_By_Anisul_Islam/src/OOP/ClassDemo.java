package OOP;

public class ClassDemo {

    String gender, name, phone;

    void setInformation(String n, String g, String p){
        name = n;
        gender = g;
        phone = p;
    }
    
    void displayInformation() {

        System.out.println("name: " + name);
        System.out.println("gender: " + gender);
        System.out.println("phone: " + phone);
        System.out.println("\n\n");
    }
}
