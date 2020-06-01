package OOP.inheritance;

public class TeacherMehodOverriding extends Person {
    //name, age, displayInfo1() method import for this class

    static String qualification;
    //you can use final keyword on child class 
    @Override
    final void displayInfo1() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Qualification: " + qualification);
        System.out.println("\n");
    }
}
