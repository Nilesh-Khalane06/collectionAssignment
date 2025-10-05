//3. Use a Function<String, Boolean> (or Predicate<String> ) to check if
//a string is a palindrome. Input is from Supplier<String> , output printed using
//Consumer<Boolean> .

package FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class CheckPalindrome {
	public static void main(String[] args) {

		Supplier<String> supplier = () -> "madamm";

		Function<String, String> function = (x) -> {
			String rev = "";
			for (int i = x.length() - 1; i >= 0; i--) {
				rev = rev + x.charAt(i);

			}
			return rev;
		};

		Consumer<String> consumer = (x) -> {
			System.out.println(x + " is Palindrone");
		};

		if(supplier.get().equals(function.apply(supplier.get()))) {
			consumer.accept(supplier.get());
			
		}else {
			System.out.println(supplier.get() +"not palindrome");
		}
	}

}
