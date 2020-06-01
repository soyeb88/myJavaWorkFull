package DataStructure.Array;

public class Array2D_2 {

    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        int k = 1;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = k;
                k++;
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        
        System.out.println("");
        
        k=1;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < row + 1; col++) {
                arr[row][col] = k;
                k++;
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < row + 1; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
