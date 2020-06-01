package OOP.inheritance;

public class InheritanceMain {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        teacher.name = "Soyeb";
        teacher.age = 24;
        teacher.qualification = "Student";

        teacher.displayInfon2();

        teacher.name = "Nasir";
        teacher.age = 35;
        teacher.qualification = "Government Employee";

        teacher.displayInfon2();

    }
}
