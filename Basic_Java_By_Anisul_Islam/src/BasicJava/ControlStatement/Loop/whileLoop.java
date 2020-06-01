package BasicJava.ControlStatement.Loop;

public class whileLoop {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println("Bangladesh");
            i++;
        }

        i = 2;
        while (i <= 100) {
            System.out.print(i + " ");
            i = i + 2;
        }
        
        System.out.println("");
        i = 99;
        while (i >= 1) {
            System.out.print(i + " ");
            i = i - 2;
        }
    }
}
