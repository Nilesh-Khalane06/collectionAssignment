package List_SetMixBased;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//Create a List<String> and remove all elements whose length is less than 4 using
//another list (don’t use removeIf or iterator).

public class Remove {
	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("aja","Nilesh","chetan","Nil");
		List<String> newlist=new LinkedList<>();
		
		for (String str : list) {
			if(str.length()>=4) {
				newlist.add(str);
				
			}
			
		}
		System.out.println(newlist);
	}

}
