package OOP;

public class RestrStatic {

    int x = 10;
    static int y = 20;

    void infoMe() {
        infoMe2();
        System.out.println("I am not static");
    }

    static void infoMe2() {
        //infoMe();
        //x;
        System.out.println(y);;
        System.out.println("I am static");
    }
}
