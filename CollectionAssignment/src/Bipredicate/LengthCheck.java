//Write a BiPredicate<String, Integer> that returns true if the length of the
//string is greater than the given number.

package Bipredicate;

import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LengthCheck {
	public static void main(String[] args) {

		Supplier<String> str = () -> "Nilesh";
		Supplier<Integer> num = () -> 5;

		BiPredicate<String, Integer> function = (x, y) -> x.length() > y;

		Consumer<String> consumer = (x) -> System.out.println(x);
		
		String name=str.get();
		int num1=num.get();
		
		if(function.test(name, num1)) {
			consumer.accept("Length of string is greater than number");
			
		}else {
			consumer.accept("Length of string is  NOT greater than number");
			
		}
	}

}
