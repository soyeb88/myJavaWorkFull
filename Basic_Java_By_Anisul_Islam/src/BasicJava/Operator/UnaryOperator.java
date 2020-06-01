package BasicJava.Operator;

public class UnaryOperator {

    public static void main(String[] args) {
        int x = 10;
        int result;

        //+x
        result = +x;
        System.out.println("result: " + result);

        //-x
        result = -x;
        System.out.println("result: " + result);

        int m = 25, n;
        n = m++; //post increment 
        System.out.println("n = " + n);

        n = m; //post increment 
        System.out.println("n = " + n);

        n = ++m; //pre increment 
        System.out.println("n = " + n);

        n = m; //pre increment 
        System.out.println("n = " + n);

        n = m--; //post increment 
        System.out.println("n = " + n);

        n = m; //post increment 
        System.out.println("n = " + n);

        n = --m; //pre increment 
        System.out.println("n = " + n);

        n = m; //pre increment 
        System.out.println("n = " + n);

    }
}
