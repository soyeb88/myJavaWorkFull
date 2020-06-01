package OOP.Abstract;

public class Test {
    public static void main(String[] args) {
        MobileUser mu; //referance varaible but you cannot create object on abstract class
        mu = new Rahim();
        mu.call();
        mu.sendMessage();
        
        mu = new Karim();
        mu.sendMessage();
    }
}
