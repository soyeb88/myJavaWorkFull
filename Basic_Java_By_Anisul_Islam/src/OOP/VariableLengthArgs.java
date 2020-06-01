package OOP;

public class VariableLengthArgs {
    int sum = 0;
    void add(int ... num){
        for (int x:num) {
            sum = sum + x;
        }
        System.out.println("Sum of All numbers: " + sum);
    }
}
