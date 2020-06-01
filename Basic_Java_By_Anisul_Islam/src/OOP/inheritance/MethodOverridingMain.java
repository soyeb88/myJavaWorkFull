package OOP.inheritance;

public class MethodOverridingMain {

    public static void main(String[] args) {
        TeacherMehodOverriding teacher = new TeacherMehodOverriding();
        
        //overriding method
        teacher.name = "Soyeb";
        teacher.age = 24;
        teacher.qualification = "Student";
        teacher.displayInfo1();
        
        Person teacher2 = new Person();
        
        //superclass method 
        teacher2.name = "Nasir";
        teacher2.age = 29;
        teacher2.displayInfo1();
    }
}
