package OOP.inheritance;

public class finalKeyWord {

    public static class University {

        final String NAME = "QC"; // final variable -- final variable should be capital letter
        final int fees; //blank final variable - not initialize
        static final int age; //age static blank final variable -- not initialze

        University() {
            fees = 200;
        }
        
        static{ 
            age = 20;
        }
        /*
            name = "LaGuardia Community College"; 
            //it makes errot since name is final keyword
         */
        void display() {
            System.out.println(NAME);
            System.out.println(fees);
            System.out.println(age);
        }
    }

    public static void main(String[] args) {
        University obj = new University();
        obj.display();
        
        System.out.println("Fees: " + obj.fees);
        System.out.println("Age: " + University.age);
    }
}
