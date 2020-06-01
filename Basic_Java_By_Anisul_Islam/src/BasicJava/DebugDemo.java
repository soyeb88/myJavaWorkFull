package BasicJava;

public class DebugDemo {
    public static void main(String[] args) {
         
        //we want to see 17 number line execution
        //Debuh > New Watch
        //type variable name that I want to watch
        //double click on before line that variable
        //ebuh > Debug File
        //Click Step Over
        //After Finish please Continue
        //the right click on variable and you can delete or add variable for debugging
        
        int sum = 0;
        for (int i = 0; i < 10; i++) {
             sum = sum + i;
        }
        System.out.println("sum is " + sum);
    }
}
