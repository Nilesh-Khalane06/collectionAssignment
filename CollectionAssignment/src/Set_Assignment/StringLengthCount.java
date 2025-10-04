package Set_Assignment;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//print that the string length is 4
public class StringLengthCount {
	public static void main(String[] args) {
		
		Set<String> set=new TreeSet<>();
		set.add("More");
		set.add("Nilu");
		set.add("Chetan");
		set.add("Nilesh");
		set.add("Jayu");
		
		for (String string : set) {
			if(string.length()==4) {
				System.out.println(string);
				
			}
			
		}
	}

}
