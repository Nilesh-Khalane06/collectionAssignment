
//Create a BiPredicate<String, String> that checks if two strings are equal
//(case-insensitive). Test it with inputs like ("hello", "HELLO").

package Bipredicate;

import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class CheckEqual {
	public static void main(String[] args) {

		Supplier<String> string1 = () -> "nilesh";
		Supplier<String> string2 = () -> "NILESH";

		BiPredicate<String, String> predicate = (x, y) ->  x.equalsIgnoreCase(y);

		Consumer<String> consumer = (x) -> System.out.println(x);

		String val1 = string1.get();
		String val2 = string2.get();

		if (predicate.test(val1, val2)) {
			consumer.accept("both string are equal");

		} else {
			consumer.accept("both string are  not equal");
			
		}
	}

}
