package DataStructure.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        System.out.println("Size: " + name.size());

        //Add elements
        name.add("Soyeb");
        name.add("Zahir");
        name.add("Nasir");
        name.add("Badal");
        name.add(2, "Jesmin");

        //Method 1: print arrayList result
        System.out.println(name);

        //Method 2: print arrayList result using each for loop
        for (String x : name) {
            System.out.print(x + " ");
        }
        System.out.println();

        //Method 3: print arrayList result using iterator class
        Iterator itr = name.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        boolean contain = name.contains("Badal");
        System.out.print("Is Badal contain in ArrayList? " + contain);
        System.out.println();

        int pos = name.indexOf("Badal");
        System.out.print("Index of Badal: " + pos);
        System.out.println();

        System.out.print(name.set(4, "Lal Mia")); //it replace the value and return old value
        System.out.println(name);

        System.out.print("get index 0 " + name.get(0));
        System.out.println();

        System.out.println("Size: " + name.size());

        name.remove(1);
        System.out.println("After 1 index removed: " + name);
        System.out.println(name.size());

        //name.removeAll(name);
        name.clear();
        //System.out.println("After removed all: " + name);
        System.out.println("After clear: " + name);
        System.out.println(name.size());

        System.out.println(name.isEmpty());
    }
}
