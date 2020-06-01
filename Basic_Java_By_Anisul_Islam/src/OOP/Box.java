package OOP;

public class Box {
    double height, width, depth;
    
    /*
        Box(double h, double w, double d){
            height = h;
            width = w;
            depth = d;
        }
    */
    
    //instance variable hiding
    Box(double height, double width, double depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    
    void display(){
        double volume = height*width*depth;
        System.out.println("Volume is: " + volume);
    }
}
