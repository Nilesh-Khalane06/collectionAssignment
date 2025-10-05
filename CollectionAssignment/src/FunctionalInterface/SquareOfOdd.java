//Create a program that uses Predicate<Integer> to check if a number is odd, and
//if it is, print its square using Function and Consumer .

package FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SquareOfOdd {
	public static void main(String[] args) {
		Supplier<Integer> supplier = () -> 13;

		Predicate<Integer> predicate = num -> num % 2 != 0;

		Function<Integer, Integer> function = num -> {
			int result = num * num;
			return result;
		};

		Consumer<Integer> consumer = result -> System.out.println("Square is: " + result);
		
		int num=supplier.get();
		int result=function.apply(num);
		
		if(predicate.test(num)) {
			consumer.accept(result);
			
		}else {
			System.out.println("Number is even");
			System.err.println("Enter odd number");
		}

	}

}
