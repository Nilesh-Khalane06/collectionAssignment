package Set_Assignment;

import java.util.LinkedHashSet;
import java.util.Set;

//count all the vowels across the all string
public class VowelsCount {
	public static void main(String[] args) {
		
		Set<String> s=new LinkedHashSet<>();
		s.add("nilesh");
		s.add("nakul");
		s.add("chetan");
		s.add("ajay");
		s.add("rohit");
		
		int totalvowelscount=0;
		
		for (String str : s) {
			int wordvowelcount=0;
			
			for(int i=0;i<str.length();i++) {
				char ch=str.toLowerCase().charAt(i);
				if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u') {
					wordvowelcount++;
				}
				
			}
			
			System.out.println("Word: "+str+" vowels: "+wordvowelcount);
			 totalvowelscount=totalvowelscount+wordvowelcount;            //all wordsvowels added in the total vovels
			
			
		}
		System.out.println("Total vowels all words: "+totalvowelscount);
		
	}

}
