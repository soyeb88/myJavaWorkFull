package OOP.Polymorphism;

public class Polymorphism {
    static class Person{
    
        void display(){
            System.out.println("I am in person.");
        }
        
    }
    
    static class Teacher extends Person{
        
        @Override
        void display(){
            System.out.println("I am in Teacher.");
        }
    }
    
    static class Student extends Person{
    
        @Override
        void display(){
            System.out.println("I am in Student.");
        }
        
    }
    public static void main(String[] args) {
        
        Person person = new Person();
        //Teacher teacher = new Teacher();
        //Student student = new Student();
        
        person.display();
        
        person = new Teacher();
        person.display();
        
        person = new Student();
        person.display();
        //teacher.display();
        //student.display();
        
    }
}
