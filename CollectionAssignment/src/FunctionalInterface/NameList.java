//Create a Supplier<List<String>> to provide a list of names. Use a
//Consumer<List<String>> to print each name using enhanced for-loop.

package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class NameList {
	public static void main(String[] args) {

		Supplier<List<String>> supplier = () -> Arrays.asList("Nilesh", "chetan", "Gopal", "Nakul");

		Consumer<List<String>> consumer = list -> {
			for (String str : list) {
				System.out.println(str);

			}
		};

		// using foreach loop print list
		List<String> list = supplier.get();
		
		consumer.accept(list);

	}

}
