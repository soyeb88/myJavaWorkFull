package BasicJava.ControlStatement.Loop;

public class doWhileLoop {
    public static void main(String[] args) {
        //condition false 
        int i = 1;
        do {
            System.out.println("Bangladesh");
            i++;
        } while (i >= 10);
        
        //condition true
        i = 1;
        do {
            System.out.println(i+  " Bangladesh");
            i++;
        } while (i <= 10);
        
    }
}
