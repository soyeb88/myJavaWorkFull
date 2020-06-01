package OOP;

public class Static {
    String name;
    int id;
    static String UniversityName = "Queens College";
    
    Static(String n, int i){
        name = n;
        id = i;
    }
    
    void displayInformation(){
        System.out.println("Name: "+name);
        System.out.println("id: "+id);
        System.out.println("University Name: "+UniversityName);
    }
}
