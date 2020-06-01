package OOP;

public class Test5 {

    public static void main(String[] args) {

        Static s1 = new Static("Soyeb", 26);
        Static s2 = new Static("Zahir", 32);

        s1.displayInformation();
        s2.displayInformation();

        //called static variable
        System.out.println("University Name: " + Static.UniversityName);
        
        //create two objects
        Static2 stc = new Static2();
        stc.showInfo();

        Static2 stc2 = new Static2();
        stc2.showInfo();
        
        Static2.StaticMethod();
    }
}
