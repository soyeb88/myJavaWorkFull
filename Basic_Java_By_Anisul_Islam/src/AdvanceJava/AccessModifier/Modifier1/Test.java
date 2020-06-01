package AdvanceJava.AccessModifier.Modifier1;

public class Test {
    public static void main(String[] args) {
        A modifier = new A();
        modifier.display3(); //now it works since it same package and default
        modifier.display2(); 
        modifier.showMessage(); //another method to display private modifier 
    }
}
