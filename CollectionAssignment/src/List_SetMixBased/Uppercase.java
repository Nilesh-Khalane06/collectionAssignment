package List_SetMixBased;

import java.util.LinkedHashSet;
import java.util.Set;

//8. Create a Set<String> of colors. Convert all elements to uppercase and store in a
//new set. Print both.
public class Uppercase {
	public static void main(String[] args) {
		
		Set<String> set=new LinkedHashSet<>();
		Set<String> newset=new LinkedHashSet<>();
		
		set.add("red");
		set.add("blue");
		set.add("pink");
		set.add("white");
		
		for (String str : set) {
			newset.add(str.toUpperCase());
			
		}
		System.out.println(set);
		System.out.println(newset);
	}

}
