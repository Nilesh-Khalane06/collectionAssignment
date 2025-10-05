
//Use a BiPredicate<Integer, Integer> to check if the first number is
//divisible by the second.
package Bipredicate;

import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class CheckDivisability {
	public static void main(String[] args) {

		Supplier<Integer> num1 = () -> 15;
		Supplier<Integer> num2 = () -> 20;

		BiPredicate<Integer, Integer> predicate = (x, y) -> x%y==0;

		Consumer<String> consumer = x -> System.out.println(x);

		int val1 = num1.get();
		int val2 = num2.get();

		if (predicate.test(val1, val2)) {
			consumer.accept("first number is divible by second");

		} else {
			consumer.accept("First number is not divisible by second");
		}

	}

}
