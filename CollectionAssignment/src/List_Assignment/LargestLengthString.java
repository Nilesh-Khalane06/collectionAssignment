package List_Assignment;

import java.util.Arrays;
import java.util.List;

//largest length String print
public class LargestLengthString {
	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("Nilesh","Chetan","Ajay","Goapl","Rohit");
	
		//firstly find the maximum length
		int maxlength=0;
		for (String str : list) {
			if(str.length()>maxlength) {
				maxlength=str.length();	
			}
		}
		//if another string with the same length it also print
		System.out.println("String with the maximum length"+"("+maxlength+")");
		for (String str : list) {
			if (maxlength==str.length()) {
				System.out.println(str);
				
			}
			
		}
		
		
		
	}

}
