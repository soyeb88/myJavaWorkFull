import java.util.HashMap;

public class hashmap1 {

	public static void main(String[] args) {
		// Create a HashMap object called myList
		HashMap<String, String> myList = new HashMap<String, String>();
		
		// Add keys and values (Relation, Name)
		myList.put("Friend", "Kanon");
		myList.put("Relative", "Sohel");
		myList.put("Friend", "Rifat");
		myList.put("Relative", "Lipu");
		
		// Print keys
		for (String i : myList.keySet()) {
		  System.out.println(i);
		}
		
		// Print values
		for (String i : myList.values()) {
		  System.out.println(i);
		}
		
		// Print keys and values
		for (String i : myList.keySet()) {
		  System.out.println("key: " + i + " value: " + myList.get(i));
		}
		
		//print the HashMap
		System.out.println(myList);
		
		System.out.println(myList.size());
		
		//Result: {Relative=Kanon, Frined=Kanon}
		
		System.out.println(myList.get("Friend"));
		myList.remove("Friend");
		System.out.println(myList);
		
		myList.clear();
		
		System.out.println(myList);
		
	}

}
