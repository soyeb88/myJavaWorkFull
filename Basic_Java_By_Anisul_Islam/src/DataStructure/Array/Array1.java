package DataStructure.Array;

public class Array1 {
    public static void main(String[] args) {
        
        //one way declared and creation an array 
        int[] number;         //declaring an Array
        number = new int[5];  // cration an Array and fixed the size
        
        //second way declared and creation an array 
        int[] number2 = new int[5];  //preferable by java developer
        
        //Third way declared and creation an array 
        int number3[] = new int[5];  //not preferable
        
        //Method 1: initialize an array
        number[0] = 10;  //array start from 0 index
        number[1] = 20;
        number[2] = 30;
        number[3] = 40;
        number[4] = 50;
        
                
        //Method 2: initialize an array
        
        int[] number4 = {10, 20, 30, 40, 50, 60};
        System.out.println("Size of number4: " + number4.length);

        
        //print array index value
        System.out.println("number[0] value is " + number[0]);
        
        int len = number.length;
        System.out.println("Size of array: " + len);
        
        int sum = number[0] + number[1] + number[2] + number[3]+ number[4];
        System.out.println("Sum of five array index value: " + sum);
        
        //note 1: No Error
        int[] number5 = new int[5];
        number5[0] = 22;
        number5[1] = 24;
        
        System.out.println(number5[0] + " " + number5[1]); 
        
        //note 2: Error
        
        /*
            int[] number6 = new int[3];
            number6[0] = 22;
            number6[1] = 24;
            number6[2] = 25;
            number6[3] = 26;
        
            System.out.println(number6[3]);
        */
        
         //note 3
        int[] number7 = new int[5];
        number7[0] = 22;
        number7[1] = 24;
        
        System.out.println("Address of the array \'number3\' " + number); //it will show the address of the array
        System.out.println("Address of the array \'number4\' " + number2); //it will show the address of the array
        System.out.println("Address of the array \'number6\' " + number7); //it will show the address of the array
    }
}
