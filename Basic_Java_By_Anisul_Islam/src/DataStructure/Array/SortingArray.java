package DataStructure.Array;

import java.util.Arrays;

public class SortingArray {

    public static void main(String[] args) {
        int[] arr = {2, -3, 1, 2, 3};

        Arrays.sort(arr);
        System.out.println("Ascending: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println("\n\n");
        
        System.out.println("Descending: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println("\n\n");
        
        String[] str = {"Soyeb", "Badal", "Nasir", "Zahit", "Jesmin"};

        Arrays.sort(str);
        System.out.println("Ascending: ");
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
        System.out.println("\n\n");
        System.out.println("Descending: ");
        for (int i = str.length - 1; i >= 0; i--) {
            System.out.print(str[i] + " ");
        }
    }
}
