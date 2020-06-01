package Tutoring;

import java.io.*;

public class IO{
    public static void main(String[] args) throws IOException{
        DataOutputStream dataout = new DataOutputStream(new FileOutputStream("input_1.txt"));
        dataout.writeUTF("hello world. How are you");
        
        DataInputStream dataIn = new DataInputStream(new FileInputStream("input_1.txt"));
        //dataIn.read(b, 0, 0);
        
        while (dataIn.available() > 0) {
            String k =dataIn.readUTF();
            System.out.println(k + " ");
        }
    }
}
