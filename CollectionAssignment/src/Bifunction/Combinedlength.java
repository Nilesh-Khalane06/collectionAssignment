
//Use a BiFunction<String, String, Integer> to return the total length of
//two strings combined.
package Bifunction;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Combinedlength {
	public static void main(String[] args) {

		Supplier<String> pass1 = () -> "Nilesh";
		Supplier<String> pass2 = () -> "Khalane";

		BiFunction<String, String, Integer> function = (x, y) -> {
			String combine = x + y;
			int length = combine.length();
			return length;

		};

		Consumer<Integer> consumer = (result) -> System.out.println("Total length is: " + result);

		String val1 = pass1.get();
		String val2 = pass2.get();

		int result = function.apply(val1, val2);

		consumer.accept(result);
	}

}
