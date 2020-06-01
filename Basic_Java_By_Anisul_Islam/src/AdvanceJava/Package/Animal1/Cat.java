package AdvanceJava.Package.Animal1;

//import AdvanceJava.Package.Animal2.Tiger;
//import AdvanceJava.Package.Animal2.Bird;
import AdvanceJava.Package.Animal2.*;



public class Cat {

    void display() {
        System.out.println("I am in Cat");

    }

    public static void main(String[] args) {
        //same package
        Dog dog = new Dog(Tiger.in);
        dog.display();
        
        
        //different package
        Tiger tiger = new Tiger();
        tiger.display();
        System.out.println(Tiger.in);
        
        Bird bird = new Bird();
        bird.display();
    }
}
