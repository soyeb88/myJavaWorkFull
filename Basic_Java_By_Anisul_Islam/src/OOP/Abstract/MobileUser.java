package OOP.Abstract;

abstract public class MobileUser {
    
    /*
        here you create call method which is not abstract.
        therefore it can also take non-abstract method
    */
    
    void call(){
        System.out.println("Call Now");
    }
    
    /* 
    
        now this is fully abstract but 
        if we give another non-abstract method 
        then it will losse  fully abstract

    */
    abstract void sendMessage();
}
