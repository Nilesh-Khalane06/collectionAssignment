//Create a BiConsumer<String, String> that prints a combined greeting
//message, like: "Hello Alice and Bob!"

package BiConsumer;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class CombinedMassage {
	public static void main(String[] args) {

		Supplier<String> str1 = () -> "Chetan";
		Supplier<String> str2 = () -> "Nilesh";

		BiConsumer<String, String> consumer = (x, y) -> System.out.println("Hello " + x + " and " + y+"!");
		
		String val1=str1.get();
		String val2=str2.get();
		consumer.accept(val1, val2);
	}

}
