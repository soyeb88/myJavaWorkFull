package OOP;

public class StaticBlock {
    static int x;
    static String name; 
    
    static{
        //x = 10;
        //name = "Soyeb";
        
        System.out.println("I am in static");
    }
    
    static void info(){
        System.out.println("x value" + x);
        System.out.println("name value " + name);
    }
    
    public static void main(String[] args) {
        //StaticBlock.info();
        
        System.out.println("I am in main");
    }
}
