package OOP.inheritance;

public class TeacherPrivate extends PersonPrivate {
    //getName(). getAge(), setName(), setAgme()
    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    
    void displayInfo(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getQualification());
        
        System.out.println("\n\n");
    }
}
