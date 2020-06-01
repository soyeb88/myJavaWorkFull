package OOP.Abstract.Interface;

public class MultipleInterface_C implements MultipleInterface_A, MultipleInterface_B{

    @Override
    public void play() {
        System.out.println("Hello I am from C");
        System.out.println(X);
    }
    
}
