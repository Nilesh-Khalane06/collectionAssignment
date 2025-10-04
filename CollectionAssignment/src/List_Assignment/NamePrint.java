package List_Assignment;

import java.util.Arrays;
import java.util.List;

//2.Those name print who name start with "A"
public class NamePrint {
	public static void main(String[] args) {

		List<String> s = Arrays.asList("Ajya", "Nilesh", "Chetan", "Arun");

		for (String string : s) {
			if (string.startsWith("A")) {
				System.out.println(string);

			}

		}

	}

}
