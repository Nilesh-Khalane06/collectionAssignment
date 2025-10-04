package List_SetMixBased;

import java.util.Arrays;
import java.util.List;

//Given two List<String> objects, print common elements (intersection) using
//enhanced for-loop
public class CommonElementsPrint {
	public static void main(String[] args) {
		List<String> list1=Arrays.asList("Nil","Nakul","Rohit","chetan");
		
		List<String> list2=Arrays.asList("Nil","Nilesh","Priya","chetan");
		
		
		for (String string : list1) {
			for (String string2 : list2) {
				if(string.equals(string2)) {
					System.out.println(string);
				}
				
			}
			
		}
		
	}
	
	
	
			
	

}
