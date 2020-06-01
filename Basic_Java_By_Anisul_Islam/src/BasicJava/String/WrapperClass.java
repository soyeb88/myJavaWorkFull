package BasicJava.String;

public class WrapperClass {
    public static void main(String[] args) {
        
        //primitive -> Object
        int x = 30;
        Integer y = Integer.valueOf(x);
        System.out.println("y = " + y);
        
        //primitive -> Object
        Integer z = x; //Integer.valueOf(x) autoboxing
        System.out.println("z = " + z);
        
        //Object -> primitive
        Double d = new Double(12.2); //create object
        System.out.println("d : " +d);
        
        double e = d.doubleValue(); //convert object to primitive
        System.out.println("e: " + e);
        
        double f = d;  //d.doubleValue();
        System.out.println("f: " + e);
        
    }
}
