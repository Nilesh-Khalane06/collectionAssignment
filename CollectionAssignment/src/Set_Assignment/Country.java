package Set_Assignment;

import java.util.LinkedHashSet;
import java.util.Set;

//add some country in the set print those county that rae the end with the a
public class Country {
	public static void main(String[] args) {
		
		Set<String> set=new LinkedHashSet<>();
		
		set.add("India");
		set.add("Australia");
		set.add("Srilanka");
		set.add("Afganistan");
		set.add("Brazil");
		set.add("India");
		
		for (String string : set) {
			if(string.endsWith("a")) {
				System.out.println(string);
				
			}
			
		}
	}

}
