package OOP;

public class Test4 {

    public static void main(String[] args) {
        //without paramaterized constructor
        ClassConstructorDemo teacher = new ClassConstructorDemo();
        //teacher2.displayInformation();

        //with paramaterized constructor
        ClassConstructorDemo teacher1 = new ClassConstructorDemo("Soyeb", "male", "01680550309");
        teacher1.displayInformation();

        //overloading constrcutor
        ClassConstructorDemo teacher2 = new ClassConstructorDemo("Nasir", "male");
        teacher2.displayInformation();

        //return value from method
        int value = teacher.square(2);
        System.out.println("Square of 2: " + value);

        value = teacher.square(9);
        System.out.println("Square of 2: " + value);
    }
}
