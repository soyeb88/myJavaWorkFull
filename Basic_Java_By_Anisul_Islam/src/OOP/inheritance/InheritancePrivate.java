package OOP.inheritance;

public class InheritancePrivate {

    public static void main(String[] args) {
        TeacherPrivate teacher = new TeacherPrivate();

        teacher.setName("Soyeb");
        teacher.setAge(25);
        teacher.setQualification("Student");

        //System.out.println(teacher.getName());
        //System.out.println(teacher.getAge());
        //System.out.println(teacher.getQualification());
        teacher.displayInfo();
        
        //System.out.println("\n\n");
        
        TeacherPrivate teacher2 = new TeacherPrivate();
        
        teacher2.setName("Kanon");
        teacher2.setAge(22);
        teacher2.setQualification("Student");
        
        teacher2.displayInfo();

    }
}
