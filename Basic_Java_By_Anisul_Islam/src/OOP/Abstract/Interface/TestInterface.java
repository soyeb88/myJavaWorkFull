package OOP.Abstract.Interface;

public class TestInterface {

    public static void main(String[] args) {
        //one way: you cannot intiated interface 
        Animal animal;

        animal = new Dog();
        animal.eat();
        

        animal = new Cat();
        animal.eat();
        
        //second way: 
        Dog dog = new Dog();
        dog.eat();
        
        Cat cat = new Cat(); 
        cat.eat();
        
        
        
        
    }
}
