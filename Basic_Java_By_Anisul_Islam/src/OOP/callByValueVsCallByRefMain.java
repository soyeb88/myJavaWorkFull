package OOP;

public class callByValueVsCallByRefMain {
    public static void main(String[] args) {
        //call by value
        int i = 10;
        System.out.println("before enter object: " + i);
        callByValueVsCallByRef call = new callByValueVsCallByRef();
        call.callByValueChange(20);
        System.out.println("before enter object: " + i);
        
        System.out.println("\n\n");
        
        //call by regerance
        call.j = 10;
        System.out.println("before enter object: " + call.j);
        call.callByRefchange(call);
        System.out.println("before enter object: " + call.j);

        
    }
}
