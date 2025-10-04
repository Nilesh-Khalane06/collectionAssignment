package List_SetMixBased;

import java.util.Arrays;
import java.util.List;

//. Create a List<String> of full names (e.g. "John Doe"). Print only the first names.
public class FirstName {
	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("Nilesh khalane","chetan more","gopal dawar");
		
		for (String str : list) {
			System.out.println(str.split(" ")[0]);
			
		}
	}

}
