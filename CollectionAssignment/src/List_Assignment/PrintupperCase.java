package List_Assignment;

import java.util.Arrays;
import java.util.List;

//All names print in upperCase
public class PrintupperCase {
	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("nilesh","chetan","gopal","nakul");
		
		for (String string : list) {
			System.out.println(string.toUpperCase());
			
		}
	}

}
