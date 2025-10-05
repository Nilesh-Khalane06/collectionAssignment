//Use Function<String, String> to convert a string to uppercase. Provide the
//string using a Supplier and print the result using Consumer .

package FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class UpperCase {
	public static void main(String[] args) {

		Supplier<String> supplier = () -> "nilesh";

		Function<String, String> function = name -> {
		String result=name.toUpperCase();
		return result;
		
		};

		Consumer<String> consumer = result -> System.out.println(result);
		
		
		String name=supplier.get();
		String upper=function.apply(name);
		consumer.accept(upper);
	}

}
