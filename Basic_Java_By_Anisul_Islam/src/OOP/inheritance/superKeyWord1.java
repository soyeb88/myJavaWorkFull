package OOP.inheritance;

public class superKeyWord1 {

    public class superA {

        superA() {
            System.out.println("Inside Super Class and Super Class Constructor method.");
        }

        int x = 5;

        void display() {
            System.out.println("Inside Super Class and a regular method.");
        }
    }

    public static class superB extends superA {
        //x=5

        int x = 10;

        superB() {
            super();
            System.out.println("Inside child Class and child Class Constructor method.");
        }

        @Override
        void display() {
            super.display();
            System.out.println("x value without super = " + x);
            System.out.println("x value with super = " + super.x);
        }
    }

    public static void main(String[] args) {
        superB obj = new superB();
        obj.display();

    }
}
