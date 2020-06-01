package BasicJava.String;

public class StringBufferDemo {

    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Soyeb");
        System.out.println("String Buffer: " + sb);
        
        String s1 = "Soyeb Ahmed";
        
        //you need one more String to take the replacement String
        s1.replace('e', 'j');
        System.out.println("s1 afte replacemet: " + s1); //it  doesn't replace
        
        //Append the String
        sb.append(" Ahmed ");
        sb.append(25);
        System.out.println("Append the String: " + sb);
        
        //replace the String
        sb.replace(0, 5, "Nasir");
        System.out.println("sb: " + sb);
        
        //reverse the String
        sb.reverse();
        System.out.println("Reverse the String: " + sb);
        
        //delete the String
        sb.delete(0, 5); //delete index from 0 to 5
        System.out.println("Deleting index from 0 to 5: " + sb);
        
        //set the length of the String
        sb.setLength(5);
        System.out.println("Set the length of the String: " + sb);
        
        //you can also give String variable for arguments
        StringBuffer sb2 = new StringBuffer(s1); 
        System.out.println(sb2);
    }
}

