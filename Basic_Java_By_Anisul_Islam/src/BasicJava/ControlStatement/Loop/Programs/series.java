package BasicJava.ControlStatement.Loop;

import java.util.Scanner;

public class series {
    public static void main(String[] args) {
        
        //series 1
        int m;
        int sum=0;
        
        System.out.print("Please enter last number: ");
        Scanner input = new Scanner(System.in);
        
        m = input.nextInt();
        
        for (int i = 1; i <= m; i++) {
            System.out.print(i + " ");
            sum = sum + i;
        }
        System.out.println("");
        System.out.println("Sum of sereis: " + sum);
        
        //series 2
        sum=0;
        
        System.out.print("Please enter last number: ");
        m = input.nextInt();
        
        for (int i = 1; i <= m; i = i+2) {
            System.out.print(i + " ");
            sum = sum + i;
        }
        System.out.println("");
        System.out.println("Sum of sereis: " + sum);
        
        //series 3
        sum=0;
        
        System.out.print("Please enter last number: ");
        m = input.nextInt();
        
        for (int i = 2; i <= m; i = i+2) {
            System.out.print(i + " ");
            sum = sum + i;
        }
        System.out.println("");
        System.out.println("Sum of sereis: " + sum);
        
        //series 4
        double dbsum=0;
        double n; 
        
        System.out.print("Please enter last number: ");
        n = input.nextDouble();
        
        for (double i = 1.5; i <= n; i++) {
            System.out.print(i + " ");
            dbsum = dbsum + i;
        }
        System.out.println("");
        System.out.println("Sum of sereis: " + dbsum);
        
        //series 5
        sum=0;
        
        System.out.print("Please enter last number: ");
        m = input.nextInt();
        
        for (int i = 1; i <= m; i++) {
            System.out.print(i*i + " ");
            sum = sum + i*i;
        }
        System.out.println("");
        System.out.println("Sum of sereis: " + sum);
        
        
        
        //series 6
        sum=1;
        
        System.out.print("Please enter last number: ");
        m = input.nextInt();
        
        for (int i = 1; i <= m; i++) {
            System.out.print(i + " ");
            sum = sum * i;
        }
        System.out.println("");
        System.out.println("Multplication of sereis: " + sum);
        
        //series 7
        sum=1;
        
        System.out.print("Please enter last number: ");
        m = input.nextInt();
        
        for (int i = 1; i <= m; i = i + 2) {
            System.out.print(i + " ");
            sum = sum * i;
        }
        System.out.println("");
        System.out.println("Multplication of sereis: " + sum);
        
        //series 8
        double db1sum=1;
        
        System.out.print("Please enter last number: ");
        double j = input.nextInt();
        
        for (double i = 1; i <= j; i++) {
            System.out.print(i + " ");
            db1sum = db1sum * i;
        }
        System.out.println("");
        System.out.println("Multplication of sereis: " + db1sum);
        
        //series 9
        sum=1;
        
        System.out.print("Please enter last number: ");
        m = input.nextInt();
        
        for (int i = 1; i <= m; i++) {
            System.out.print(i + " ");
            sum = sum * i*i;
        }
        System.out.println("");
        System.out.println("Multplication of sereis: " + sum);
        
       
    }
}
