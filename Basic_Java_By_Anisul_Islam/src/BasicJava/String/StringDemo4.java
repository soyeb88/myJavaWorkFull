package BasicJava.String;

public class StringDemo4 {
    public static void main(String[] args) {
        
        String s1 = " This is my country";
        System.out.println("s1 value: "+ s1);
        
        String s2 = s1.replace('i', 'j');
        System.out.println("Replace \'i\' with \'j\': "+ s2);
        
        String[] s3 = s1.split(" "); //split word after space
        
        System.out.print("Seperated word after split: ");
        for (String str: s3) {
            System.out.println(str + " ");
        }
        
    }
}
