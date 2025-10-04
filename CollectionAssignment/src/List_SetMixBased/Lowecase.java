package List_SetMixBased;

import java.util.LinkedHashSet;
import java.util.Set;

//6. Given a Set<String> of words, create a new Set<String> with all words in
//lowercase.
public class Lowecase {
	public static void main(String[] args) {
		
		Set<String> set=new LinkedHashSet<>();
		set.add("NILESH");
		set.add("CHETAN");
		set.add("NAKUL");
		set.add("GOPAL");
		
		Set<String> lowecase=new LinkedHashSet<>();
		
		for (String str : set) {
			lowecase.add(str.toLowerCase());
			
		}
		System.out.println(set);
		System.out.println(lowecase);
	}

}
