package OOP.inheritance;

//child class
public class Teacher extends Person{
    //name, age, displayInfo1() method import for this class
    String qualification;
    
    void displayInfon2(){
        //System.out.println("Name: " + name);
        //System.out.println("Age: " + age);
        displayInfo1();
        System.out.println("Qualification: " + qualification);
        System.out.println("");
    }
    
}
