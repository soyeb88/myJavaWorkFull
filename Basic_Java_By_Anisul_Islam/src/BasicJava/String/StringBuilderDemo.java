package BasicJava.String;

public class StringBuilderDemo {
    public static void main(String[] args) {
        /*
            StringBuilder is same like StringBuffer
            variable is changable
        */
        
        StringBuilder str = new StringBuilder("Soyeb");
        System.out.println("str = " + str);
        
        str.append(" Ahmed ");
        str.append(12 + " ");
        str.append(12.3);
        
        System.out.println("str = " + str);
        
        str.reverse();
        
        System.out.println("str: " + str);
        
        str.delete(2, 10);
        System.out.println("str: " + str);
    }
}