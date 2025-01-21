package trident.training;

import java.util.ArrayList;
import java.util.List;

public class ExampleArrayList {

	public static void main(String[] args) {
	
	ArrayList<String>fruits=new ArrayList<>();
	fruits.add("orange");
	fruits.add("mango");
	fruits.add("straberry");
	fruits.add("apple");
	fruits.add("banana");
	
	
	String n2 = fruits.get(2);
	System.out.println(n2);
	
	String n3 = fruits.remove(3);
	System.out.println(n3);
	 
	
	//List<String> reversed = fruits.reversed();
	//System.out.println(reversed);
	
	for (String n4 : fruits) {
		
		System.out.println(n4);
		
	}

int n5 = fruits.lastIndexOf("orange");
System.out.println(n5);
	}

}
