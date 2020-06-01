package BasicJava.String;

public class StringPalindrome {
    public static void main(String[] args) {
        /*
            while you String and its' reverse are same, that is called Palindrome
        */
        
        String s1 = "1214";
        
        StringBuffer sb = new StringBuffer(s1);
        
        String s2 = sb.reverse().toString();
        
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
        
    }
}
