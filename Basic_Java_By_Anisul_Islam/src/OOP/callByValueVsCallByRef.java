package OOP;

public class callByValueVsCallByRef {

    void callByValueChange(int i) {
        i = 20;
        System.out.println("inside the object value of i: " + i);
    }

    int j;
    void callByRefchange(callByValueVsCallByRef ref) {
        ref.j = 20;
        System.out.println("inside the object value of j: " + j);
    }
}
