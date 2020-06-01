package AdvanceJava.AccessModifier.Modifier1;

public class A {

    public void display1() {
        System.out.println("Public Modifier");
    }

    protected void display2() {
        System.out.println("Protected Modifier");
    }

    void display3() {
        System.out.println("Default Modifier");
    }

    private void display4() {
        System.out.println("Private Modifier");
    }
    
    public void showMessage(){
        display4();
    }
}
