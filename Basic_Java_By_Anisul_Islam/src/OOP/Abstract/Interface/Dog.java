package OOP.Abstract.Interface;

public class Dog implements Animal{
    //
    
    @Override
    public void eat(){
        System.out.println("Dog can eat.");
        System.out.println(NUM_OF_ANIMAL);
    } 
}
