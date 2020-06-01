package OOP.inheritance;

public class finalKeyWord2 {

    //final public static class Person {
    public static class Person {
        final void display(){
            System.out.println("I am in Perosn");
        }
    }
    
    //you cannot extends final class
    public static class Student extends Person {
        //display()
        
        
        /*
        
        //you cannot override any method that is already final 
        //but you can inherit it
        
        @Override
        void display(){
            System.out.println("I am in Student");
        }
        */
   
    }

    public static void main(String[] args) {
        
        Person person = new Person();   
        person.display();
        
        Student student = new Student();
        student.display();
    }
}
