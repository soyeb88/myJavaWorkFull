package Tutoring;

import java.util.*;

public class DataCollection {

    public static void main(String[] args) throws Exception {
        
      
      Set<Integer> set = new HashSet<Integer>();
      
      set.add(22);
      set.add(22);
      set.add(23);
      set.add(24);
      
      set.remove(22);
      
        System.out.println(set.size());
      
      
      Iterator value = set.iterator(); 
  
        // Displaying the values after iterating through the iterator 
        System.out.println("The iterator values are: "); 
        while (value.hasNext()) { 
            System.out.println(value.next()); 
      
        }
    
    }
}
