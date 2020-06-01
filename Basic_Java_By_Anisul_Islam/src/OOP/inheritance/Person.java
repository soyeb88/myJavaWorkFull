package OOP.inheritance;


//parent class
public class Person {
    String name;
    int age;
    //you cannot use static or final keyword any method overrding method
    void displayInfo1(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("\n");
    }
}
