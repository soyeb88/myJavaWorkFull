package OOP;

public class MethodOverloading {

    void add() {
        System.out.println("Nothing to add");
    }

    void add(double a, double b, double c) {
        System.out.println(a+b);
    }

    void add(int a, int b, int c) {
        System.out.println(a+b+c);
    }

    void add(double a, double b) {
        System.out.println(a+b);
    }
}
