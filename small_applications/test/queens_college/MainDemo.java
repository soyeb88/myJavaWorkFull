package queens_college;

import java.util.Scanner;

public class MainDemo {

    public static void main(String[] args) {

        String name, semester;
        int cunyId;

        Scanner input = new Scanner(System.in);

        System.out.print("Name: ");
        name = input.next();

        System.out.print("Cuny Id: ");
        cunyId = input.nextInt();
        
        System.out.print("Semester: ");
        semester = input.next();
        
        System.out.print("\n\n");
        
        System.out.println("Name: " + name);
        System.out.println("Cuny Id: " + cunyId);
        System.out.println("Semester: " + semester);
    }
}
