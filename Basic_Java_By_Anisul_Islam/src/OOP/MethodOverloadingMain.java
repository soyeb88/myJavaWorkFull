package OOP;

public class MethodOverloadingMain {

    public static void main(String[] args) {
        MethodOverloading methodoOverloading = new MethodOverloading();

        //Method Overloading
        methodoOverloading.add(2, 3);
        methodoOverloading.add(2, 3, 4);
        methodoOverloading.add(2.8, 3.4);
        methodoOverloading.add();

        //Type Conversion 
        methodoOverloading.add(2.3f, 3.5f, 4.0f);
        methodoOverloading.add('3', '4', '7'); //convert ASCI value then convert

    }
}
