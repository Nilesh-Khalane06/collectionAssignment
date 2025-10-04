package List_Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//some duplicate entry but only print the unique pr
public class UniquElements {
	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("Nilesh","Chetan","Nilesh","Gopal","Nakul","Ajay","Prafull","Chetan");
		List<String> newList=new ArrayList<>();
		
		for (String str : list) {
			if (!newList.contains(str)) {
				newList.add(str);           //adding uniquq elements in the list
				
				
			}
			
			}
		System.out.println(newList);
			
			
		}
		
	}


