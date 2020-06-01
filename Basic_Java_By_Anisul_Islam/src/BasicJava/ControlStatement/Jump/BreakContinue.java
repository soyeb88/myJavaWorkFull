package BasicJava.ControlStatement.Jump;

public class BreakContinue {

    public static void main(String[] args) {
        //break the loop on 10
        for (int i = 1; i <= 100; i++) {
            if (i == 10) {
                break;
            }
            System.out.print(i + " ");
        }
        
        System.out.println("");
        
        //skip the number 10
        for (int i = 1; i <= 100; i++) {
            if (i == 10) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
