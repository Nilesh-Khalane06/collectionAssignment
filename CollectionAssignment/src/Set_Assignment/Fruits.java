package Set_Assignment;

import java.util.LinkedHashSet;
import java.util.Set;

//create a set of the fruits
public class Fruits {
	public static void main(String[] args) {
		
		Set<String> set=new LinkedHashSet<>();  //set not allows the dublicates
		set.add("Mango");
		set.add("Papaya");
		set.add("Orange");
		set.add("Graps");
		set.add("Mango");
		
		
		for (String string : set) {
			System.out.println(string);
		}
		
	}

}
