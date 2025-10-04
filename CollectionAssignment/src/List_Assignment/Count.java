package List_Assignment;

import java.util.Arrays;
import java.util.List;

//create a list and and count how many names have more than 5 characters.
public class Count {
	public static void main(String[] args) {
		
		int namecount=0;
		
		List<String> list=Arrays.asList("Nilesh","Rohit","Sanjay","Khalane","Ajay");
		
		for (String string : list) {
			if(string.length()>5) {
				namecount++;
				
			}
			
		}
		System.out.println("Total "+namecount+" names more than 5 character");
	}

}
