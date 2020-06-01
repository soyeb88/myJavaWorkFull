package AdvanceJava.AccessModifier.Modifier2;

import AdvanceJava.AccessModifier.Modifier1.A;

public class B extends A {

    public static void main(String[] args) {
        A modifier = new A();
        modifier.display1(); //since public

        B protectedModifier = new B();
        protectedModifier.display2();

        //modifier.display3(); //since default and different package
        
        modifier.showMessage(); //to display private modifier

    }
}
