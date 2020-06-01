package BasicJava.ControlStatement.Loop;

public class forLoop {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " Bangladesh");
        }

        for (int i = 2; i <= 100; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println("");

        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("");

        for (int i = 99; i >= 1; i = i - 2) {
            System.out.print(i + " ");
        }
    }
}
