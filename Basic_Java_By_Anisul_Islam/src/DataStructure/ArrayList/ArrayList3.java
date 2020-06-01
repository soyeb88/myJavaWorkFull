package DataStructure.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<Integer> number1 = new ArrayList<>();
        
        number1.add(50);
        number1.add(10);
        number1.add(-2);
        number1.add(-4);
        
        System.out.println("Before Sorting: " + number1);
        
        Collections.sort(number1);
        
        System.out.println("After Sorting in Ascending Order: " + number1);
        
        Collections.sort(number1,Collections.reverseOrder());
        
        System.out.println("After Sorting in Descending Order: " + number1);
    }
}
