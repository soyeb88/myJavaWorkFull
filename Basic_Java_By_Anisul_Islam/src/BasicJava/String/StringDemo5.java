package BasicJava.String;

public class StringDemo5 {
    public static void main(String[] args) {
        
        //convert other primitive data type to Sring
        int a = 100;
        String s = Integer.toString(a); //toString method convert primitive data to String
        System.out.println("s: " + s);
        
        double b = 100;
        s = Double.toString(b);
        System.out.println("s: " + s);
        
        boolean c = true;
        s = Boolean.toString(c);
        System.out.println("s: " + s);
        
        //convert String to other primitive data type
        s = "32";
        int d = Integer.parseInt(s);
        System.out.println("d: " + d);
        
        s = "32.5";
        double e = Double.parseDouble(s);
        System.out.println("e: " + e);
        
        s = "32";
        int f = Integer.valueOf(s);
        System.out.println("f: " + d);
        
        s = "32.5";
        double g = Double.valueOf(s);
        System.out.println("g: " + g);
        
    }
}
