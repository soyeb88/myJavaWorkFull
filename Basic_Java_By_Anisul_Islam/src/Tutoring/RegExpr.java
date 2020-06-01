package Tutoring;


public class RegExpr {
    public static void main(String[] args) {
       String str = new String("sad._hjhk");
       System.out.println();
       System.out.print("Regex: (.*)quick brown fox(.*) " );
       System.out.println(str.matches("^[\\w]+[\\w-_\\.]*[\\w]$"));

       System.out.print("Regex: (.*)quick brown wolf jumps(.*) " );
       System.out.println(str.matches("(.*)quick brown wolf l(.*)"));
       System.out.println();
    }
}
