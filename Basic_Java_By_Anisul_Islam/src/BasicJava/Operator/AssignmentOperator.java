package BasicJava.Operator;

public class AssignmentOperator {

    public static void main(String[] args) {

        System.out.println("Assignment Operator");

        int x = 10;
        int y = 5;

        x += y; //x = x + y;
        System.out.println("x = " + x);

        x -= y; //x = x - y;
        System.out.println("x = " + x);

        x *= y; //x = x * y;
        System.out.println("x = " + x);

        x /= y; //x = x / y;
        System.out.println("x = " + x);

        x %= y; //x = x % y;
        System.out.println("x = " + x);
    }

}
