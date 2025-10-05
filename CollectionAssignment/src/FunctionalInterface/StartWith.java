//Create a Predicate<String> to check if a string starts with “A”. Use it with a
//Supplier<String> that supplies a name. If it matches, print “Name Accepted”.

package FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StartWith {
	public static void main(String[] args) {

		Supplier<String> supplier = () -> "Arun";

		Predicate<String> predicate = x -> x.toLowerCase().startsWith("a");

		Consumer<String> consumer = x -> System.out.println("Name Accepted");
		
		String name = supplier.get();
		if (predicate.test(name)) {
			consumer.accept(name);

		} else {
			System.out.println("Name Rejected");
		}
	}

}
