//Use Predicate<Integer> to check if a number is divisible by 3 or 5. Use
//Function<Integer, String> to return a message accordingly: “Fizz”, “Buzz”,
//or “FizzBuzz”.

package FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Divisibility {
	public static void main(String[] args) {
		Supplier<Integer> supplier = () -> 10;

		Predicate<Integer> divisible3 = x -> x % 3 == 0;

		Predicate<Integer> divisible5 = x -> x % 5 == 0;

		Function<Integer, String> function = x -> {
			if (divisible3.test(x) && divisible5.test(x)) {
				return "FizzBuzz";
			} else if (divisible3.test(x)) {
				return "Fizz";

			} else if (divisible5.test(x)) {
				return "Buzz";

			}else {
				return String.valueOf(x);
			}
		};
		
		Consumer<String> consumer=massage -> System.out.println(massage);
		
		int num=supplier.get();
		String result=function.apply(num);
		consumer.accept(result);
	}

}
