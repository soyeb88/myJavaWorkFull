package OOP.inheritance;

public class InstanceOfOperator {
    public static void main(String[] args) {
        Person person = new Person();
        Teacher teacher = new Teacher();
        
        //instanceof identify that this intance is a object of Class
        System.out.println(teacher instanceof Person);
        System.out.println(person instanceof Person);
        System.out.println(person instanceof Teacher);
    }
}
