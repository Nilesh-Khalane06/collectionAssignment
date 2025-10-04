package Set_Assignment;

import java.util.LinkedHashSet;
import java.util.Set;

//. Create a Set<String> and check how many strings contain the substring “ing”.

public class SubString {
	public static void main(String[] args) {
		
		Set<String> set=new LinkedHashSet<>();
		set.add("morning");
		set.add("joining");
		set.add("nilesh");
		set.add("khalane");
		set.add("walking");
		
		int count=0;
		for (String str : set) {
			if(str.toLowerCase().contains("ing")) {
				count++;
				
			}
			
		}
		System.out.println("In  set total "+count+" String contain the [ing] substring");
		
	}

}
