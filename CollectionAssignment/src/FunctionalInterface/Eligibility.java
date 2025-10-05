//Use a Supplier<Integer> to generate an age, and use a Predicate to check
//if it’s eligible for voting (>=18). Print “Eligible” or “Not Eligible” accordingly.

package FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Eligibility {
	public static void main(String[] args) {

		Supplier<Integer> supplier = () -> 13;

		Predicate<Integer> predicate = x -> x >= 18;

		Consumer<Integer> consumer = x -> System.out.println("Eligible");

		int age = supplier.get();
		if (predicate.test(age)) {
			consumer.accept(age);

		} else {
			System.out.println("Not Eligible");
		}
	}

}
