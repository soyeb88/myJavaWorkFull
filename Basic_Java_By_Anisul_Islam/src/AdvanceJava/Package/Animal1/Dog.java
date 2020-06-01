package AdvanceJava.Package.Animal1;

public class Dog {

    Boolean x = false;
    public Dog(Boolean in) {
        x = in;
    }
    
    public Dog() {
    }

    
    
    Boolean in = true;
    void display() {
        System.out.println("I am in Dog " + x);

    }

    public static void main(String[] args) {
        
        Cat cat = new Cat();
        cat.display();
        
    }
}
