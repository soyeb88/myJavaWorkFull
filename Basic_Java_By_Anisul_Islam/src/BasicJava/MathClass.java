package BasicJava;

public class MathClass {
    
    public static void main(String[] args) {
        int x = 20;
        int y = -10;
        
        int max = Math.max(x, y);
        System.out.println("Maximum between x and y: " + max);
        
        int min = Math.min(x, y);
        System.out.println("Maximum between x and y: " + min);
        
        int absolute = Math.abs(y);
        System.out.println("absolute value of y: " + absolute);
        
        int power = (int) Math.pow(2, 5);
        System.out.println("2 to the power of 5: " + power);
        
        int round = Math.round(8.4f);
        System.out.println("round of 8.4: " + round);
        
        double sqrt = Math.sqrt(4);
        System.out.println("Square of 4: " + sqrt);
        
        double log = Math.log(2);
        System.out.println("Log of 2: " + log);
        
        double exp = Math.exp(1);
        System.out.println("exponential of : " + exp);
        
        System.out.println("Pi " + Math.PI);
        System.out.println("ceiling " + Math.ceil(-5.7));
        System.out.println("floor " + Math.floor(-5.7));
    }
}
