package List_SetMixBased;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//Given a List<String> with some names,remove duplicates manually using only
//List operations (no Set).

public class DuplicateRemove {
	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("Nilesh","Chetan","nakul","Nilesh","rohit","nakul");
		List<String> newlist=new LinkedList<>();
		
		for (String str : list) {
			if(!newlist.contains(str)) {
				newlist.add(str);
				
			}
			
		}
		for (String str : newlist) {
			System.out.println(str);
			
		}
		
		
	}

}
