package OOP;

public class Static2 {
    static int count;
    
    Static2(){
        count++;
    }
    
    void showInfo(){
        System.out.println("Total Count: " + count);
    }
    
    static void StaticMethod(){
        System.out.println("I am a static Method. ");
    }
}
