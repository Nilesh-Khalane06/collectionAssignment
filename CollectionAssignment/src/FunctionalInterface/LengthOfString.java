
//Create a Function<String, Integer> to return the length of a string. Use it to
//get the length of a name provided by a Supplier<String> , and print the result
//using a Consumer<Integer> .
package FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LengthOfString {
	public static void main(String[] args) {

		Function<String, Integer> function = x -> x.length();

		Supplier<String> supplier = () -> "Nilesh";

		Consumer<Integer> consumer = x -> System.out.println("Length of String: " + x);

		String name = supplier.get(); // supply name
		int length = function.apply(name); // find the length
		consumer.accept(length); // consume(print) length
	}

}
