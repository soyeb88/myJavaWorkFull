package OOP;

public class EncapsulationMain {
    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        
        encapsulation.setName("Soyeb");
        encapsulation.setAge(24);
        
        System.out.println("Name: " + encapsulation.getName());
        System.out.println("Age: " + encapsulation.getAge());
    }
}
