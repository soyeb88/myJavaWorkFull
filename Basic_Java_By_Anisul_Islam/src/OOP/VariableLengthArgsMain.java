package OOP;

public class VariableLengthArgsMain {
    public static void main(String[] args) {
        VariableLengthArgs vla = new VariableLengthArgs();
        vla.add(10, 20, 30, 20);
        vla.add(10, 20);
        vla.add(10, 20, 20);
    }
}
