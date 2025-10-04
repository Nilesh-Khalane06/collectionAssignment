package Set_Assignment;

import java.util.LinkedHashSet;
import java.util.Set;

//Create a Set<String> and print the string with the maximum number of vowels

public class Maximumvowels {
	public static void main(String[] args) {

		Set<String> set = new LinkedHashSet<>();
		set.add("nilesh");
		set.add("nakul");
		set.add("goapl");
		set.add("nileshsanjaykhalane");
		set.add("rohit");

		
		int maxvowels = 0;
		String maxword="";
		
		for (String str : set) {
			int vowelcount = 0;

			for (int i = 0; i < str.length(); i++) {
				char ch = str.toLowerCase().charAt(i);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowelcount++;

				}

			}
			if (vowelcount > maxvowels) {
				maxvowels=vowelcount;
				maxword=str;

			}

		}
		System.out.println("String with maximum vowels: "+maxword+" (vowels:"+maxvowels+")");
	}

}
